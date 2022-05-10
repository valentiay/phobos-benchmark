package benchmarks.wide

import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder
import benchmarks.wide.data._

import java.util.concurrent.TimeUnit

@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(1)
class WideBenchmark {
  @Benchmark
  def phobos3_1 = XmlDecoder[PhobosWideItems].decode(wide1)

  @Benchmark
  def phobos3_2 = XmlDecoder[PhobosWideItems].decode(wide2)

//  @Benchmark
//  def phobos3_3 = XmlDecoder[PhobosWideItems].decode(wide3)
//
//  @Benchmark
//  def phobos3_5 = XmlDecoder[PhobosWideItems].decode(wide5)
//
//  @Benchmark
//  def phobos3_8 = XmlDecoder[PhobosWideItems].decode(wide8)
//
//  @Benchmark
//  def phobos3_13 = XmlDecoder[PhobosWideItems].decode(wide13)
//
//  @Benchmark
//  def phobos3_21 = XmlDecoder[PhobosWideItems].decode(wide21)
//
//  @Benchmark
//  def phobos3_34 = XmlDecoder[PhobosWideItems].decode(wide34)
//
//  @Benchmark
//  def phobos3_55 = XmlDecoder[PhobosWideItems].decode(wide55)
//
//  @Benchmark
//  def phobos3_89 = XmlDecoder[PhobosWideItems].decode(wide89)
//
//  @Benchmark
//  def phobos3_144 = XmlDecoder[PhobosWideItems].decode(wide144)
//
//  @Benchmark
//  def phobos3_233 = XmlDecoder[PhobosWideItems].decode(wide233)
//
//  @Benchmark
//  def phobos3_377 = XmlDecoder[PhobosWideItems].decode(wide377)
//
//  @Benchmark
//  def phobos3_610 = XmlDecoder[PhobosWideItems].decode(wide610)
//
//  @Benchmark
//  def phobos3_987 = XmlDecoder[PhobosWideItems].decode(wide987)
//
//  @Benchmark
//  def phobos3_1597 = XmlDecoder[PhobosWideItems].decode(wide1597)
//
//  @Benchmark
//  def phobos3_2584 = XmlDecoder[PhobosWideItems].decode(wide2584)
//
//  @Benchmark
//  def phobos3_4181 = XmlDecoder[PhobosWideItems].decode(wide4181)
//
//  @Benchmark
//  def phobos3_6765 = XmlDecoder[PhobosWideItems].decode(wide6765)
//
//  @Benchmark
//  def phobos3_10946 = XmlDecoder[PhobosWideItems].decode(wide10946)
//
//  @Benchmark
//  def phobos3_17711 = XmlDecoder[PhobosWideItems].decode(wide17711)
//
//  @Benchmark
//  def phobos3_28657 = XmlDecoder[PhobosWideItems].decode(wide28657)
//
//  @Benchmark
//  def phobos3_46368 = XmlDecoder[PhobosWideItems].decode(wide46368)
//
//  @Benchmark
//  def phobos3_75025 = XmlDecoder[PhobosWideItems].decode(wide75025)
//
//  @Benchmark
//  def phobos3_121393 = XmlDecoder[PhobosWideItems].decode(wide121393)

}
