import csv

rows = []

with open('jmh-result-backup.csv', newline='') as csvfile:
  reader = csv.reader(csvfile, delimiter=',', quotechar='"')
  for row in reader:
    rows.append(row)

def rowToPoint(row):
  [fullBenchmark, metric] = (row[0].split(':') + ["avgt"])[:2]
  fullBenchmarkItems = fullBenchmark.split('.')
  benchmark = '.'.join(fullBenchmarkItems[1:-1])
  [library, sizeStr] = fullBenchmarkItems[-1].split('_')
  size  = int(sizeStr)
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
benchmarks = groupBy(points, 'benchmark')

def chartBenchmark(points):
  metrics = groupBy(points, 'metric')
  avgt = metrics['avgt']
  libraries = groupBy(avgt, 'library')
  for library in libraries:
    print(library)
    print([(point['size'], point['value']) for point in libraries[library]])

for benchmark in benchmarks:
  print(benchmark)
  chartBenchmark(benchmarks[benchmark])