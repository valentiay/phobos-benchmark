import csv
import matplotlib.pyplot as plt
import os
import re

from pathlib import Path

# READ DATA

resultsDir = 'results'
rows = []
directory = os.path.join(resultsDir)
for root, dirs, files in os.walk(directory):
    for file in files:
      if file.endswith('.csv'):
        with open(f'{resultsDir}/{file}', newline='') as csvfile:
          reader = csv.reader(csvfile, delimiter=',', quotechar='"')
          for row in reader:
            rows.append(row)

itemSize = {
  'balanced.BalancedBenchmark': 1583,
  'deep.DeepBenchmark': 86,
  'wide.WideBenchmark': 1922,
}

def rowToPoint(row):
  [fullBenchmark, metric] = (row[0].split(':') + ["avgt"])[:2]
  fullBenchmarkItems = fullBenchmark.split('.')
  benchmark = '.'.join(fullBenchmarkItems[1:-1])
  [library, sizeStr] = fullBenchmarkItems[-1].split('_')
  size  = int(sizeStr) * itemSize[benchmark] / 1000
  value = float(row[4].replace(',', '.'))
  error = float(row[5].replace(',', '.'))
  return {
    'benchmark': benchmark,
    'metric': metric,
    'library': library,
    'size': size,
    'value': value,
    'error': error,
  }

def groupBy(points, field):
  dict = {}
  for point in points:
    dict[point[field]] = (dict.get(point[field], [])) + [point]
  return dict

points = [rowToPoint(row) for row in rows if row[0].startswith('benchmarks.')]

# CHART DATA

nonWordRex = re.compile('\W+')
prefixWordRex = re.compile('^\W+')

def normalizeName(name):
  return nonWordRex.sub("_", prefixWordRex.sub("", name))

def chartMetric(benchmark, metric, metrics):
  libraries = groupBy(metrics[metric], 'library')
  plt.clf()

  for library in libraries:
    points  = sorted(libraries[library], key=lambda d: d['size'])
    xs = [point['size'] for point in points]
    ys = [point['value'] for point in points]
    errors = [point['error'] for point in points]
    plt.errorbar(xs, ys, yerr=errors, label=library, capsize=5)

  plt.legend()
  plt.savefig(f'charts/{normalizeName(benchmark)}/{normalizeName(benchmark)}-{normalizeName(metric)}.png')

def chartBenchmark(benchmark, points):
  metrics = groupBy(points, 'metric')
  Path(f'charts/{normalizeName(benchmark)}').mkdir(parents=True, exist_ok=True)
  chartMetric(benchmark, 'avgt', metrics)
  chartMetric(benchmark, '·gc.alloc.rate.norm', metrics)
  chartMetric(benchmark, '·gc.time', metrics)

Path('charts').mkdir(parents=True, exist_ok=True)

benchmarks = groupBy(points, 'benchmark')
for benchmark in benchmarks:
  chartBenchmark(benchmark, benchmarks[benchmark])
