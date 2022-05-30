package benchmarks.deep

import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder

import benchmarks.deep.data._

import java.util.concurrent.TimeUnit

@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 10, timeUnit = TimeUnit.SECONDS)
@Fork(3)
class DeepBenchmark {

  @Benchmark
  def phobos3_1 = XmlDecoder[PhobosDeep].decode(deep1)

  @Benchmark
  def phobos3_2 = XmlDecoder[PhobosDeep].decode(deep2)

  @Benchmark
  def phobos3_3 = XmlDecoder[PhobosDeep].decode(deep3)

  @Benchmark
  def phobos3_5 = XmlDecoder[PhobosDeep].decode(deep5)

  @Benchmark
  def phobos3_8 = XmlDecoder[PhobosDeep].decode(deep8)

  @Benchmark
  def phobos3_13 = XmlDecoder[PhobosDeep].decode(deep13)

  @Benchmark
  def phobos3_21 = XmlDecoder[PhobosDeep].decode(deep21)

  @Benchmark
  def phobos3_34 = XmlDecoder[PhobosDeep].decode(deep34)

  @Benchmark
  def phobos3_55 = XmlDecoder[PhobosDeep].decode(deep55)

  @Benchmark
  def phobos3_89 = XmlDecoder[PhobosDeep].decode(deep89)

  @Benchmark
  def phobos3_144 = XmlDecoder[PhobosDeep].decode(deep144)

  @Benchmark
  def phobos3_233 = XmlDecoder[PhobosDeep].decode(deep233)

  @Benchmark
  def phobos3_377 = XmlDecoder[PhobosDeep].decode(deep377)

  @Benchmark
  def phobos3_500 = XmlDecoder[PhobosDeep].decode(deep500)

}
