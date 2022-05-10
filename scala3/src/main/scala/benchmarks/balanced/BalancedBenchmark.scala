package benchmarks.balanced

import benchmarks.balanced.data._
import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder

import java.util.concurrent.TimeUnit

@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(1)
class BalancedBenchmark {
  @Benchmark
  def phobos3_1 = XmlDecoder[PhobosBalancedItems].decode(balanced1)

  @Benchmark
  def phobos3_2 = XmlDecoder[PhobosBalancedItems].decode(balanced2)

//  @Benchmark
//  def phobos3_3 = XmlDecoder[PhobosBalancedItems].decode(balanced3)
//
//  @Benchmark
//  def phobos3_5 = XmlDecoder[PhobosBalancedItems].decode(balanced5)
//
//  @Benchmark
//  def phobos3_8 = XmlDecoder[PhobosBalancedItems].decode(balanced8)
//
//  @Benchmark
//  def phobos3_13 = XmlDecoder[PhobosBalancedItems].decode(balanced13)
//
//  @Benchmark
//  def phobos3_21 = XmlDecoder[PhobosBalancedItems].decode(balanced21)
//
//  @Benchmark
//  def phobos3_34 = XmlDecoder[PhobosBalancedItems].decode(balanced34)
//
//  @Benchmark
//  def phobos3_55 = XmlDecoder[PhobosBalancedItems].decode(balanced55)
//
//  @Benchmark
//  def phobos3_89 = XmlDecoder[PhobosBalancedItems].decode(balanced89)
//
//  @Benchmark
//  def phobos3_144 = XmlDecoder[PhobosBalancedItems].decode(balanced144)
//
//  @Benchmark
//  def phobos3_233 = XmlDecoder[PhobosBalancedItems].decode(balanced233)
//
//  @Benchmark
//  def phobos3_377 = XmlDecoder[PhobosBalancedItems].decode(balanced377)
//
//  @Benchmark
//  def phobos3_610 = XmlDecoder[PhobosBalancedItems].decode(balanced610)
//
//  @Benchmark
//  def phobos3_987 = XmlDecoder[PhobosBalancedItems].decode(balanced987)
//
//  @Benchmark
//  def phobos3_1597 = XmlDecoder[PhobosBalancedItems].decode(balanced1597)
//
//  @Benchmark
//  def phobos3_2584 = XmlDecoder[PhobosBalancedItems].decode(balanced2584)
//
//  @Benchmark
//  def phobos3_4181 = XmlDecoder[PhobosBalancedItems].decode(balanced4181)
//
//  @Benchmark
//  def phobos3_6765 = XmlDecoder[PhobosBalancedItems].decode(balanced6765)
//
//  @Benchmark
//  def phobos3_10946 = XmlDecoder[PhobosBalancedItems].decode(balanced10946)
//
//  @Benchmark
//  def phobos3_17711 = XmlDecoder[PhobosBalancedItems].decode(balanced17711)
//
//  @Benchmark
//  def phobos3_28657 = XmlDecoder[PhobosBalancedItems].decode(balanced28657)
//
//  @Benchmark
//  def phobos3_46368 = XmlDecoder[PhobosBalancedItems].decode(balanced46368)
//
//  @Benchmark
//  def phobos3_75025 = XmlDecoder[PhobosBalancedItems].decode(balanced75025)
//
//  @Benchmark
//  def phobos3_121393 = XmlDecoder[PhobosBalancedItems].decode(balanced121393)

}
