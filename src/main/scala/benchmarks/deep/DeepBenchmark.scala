package benchmarks.deep

import java.util.concurrent.TimeUnit
import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder
import scala.xml.XML

@State(Scope.Benchmark)
@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
class DeepBenchmark {
  private val deep1   = GenDeepString.genDeepString(1)
  private val deep2   = GenDeepString.genDeepString(2)
  private val deep3   = GenDeepString.genDeepString(3)
  private val deep5   = GenDeepString.genDeepString(5)
  private val deep8   = GenDeepString.genDeepString(8)
  private val deep13  = GenDeepString.genDeepString(13)
  private val deep21  = GenDeepString.genDeepString(21)
  private val deep34  = GenDeepString.genDeepString(34)
  private val deep55  = GenDeepString.genDeepString(55)
  private val deep89  = GenDeepString.genDeepString(89)
  private val deep144 = GenDeepString.genDeepString(144)
  private val deep233 = GenDeepString.genDeepString(233)
  private val deep377 = GenDeepString.genDeepString(377)

//  @Benchmark
//  def phobos_1 = XmlDecoder[PhobosDeep].decode(deep1)
//  @Benchmark
//  def scalaxb_1 = scalaxb.fromXML[xb.Deep](XML.loadString(deep1))
//
//  @Benchmark
//  def phobos_2 = XmlDecoder[PhobosDeep].decode(deep2)
//  @Benchmark
//  def scalaxb_2 = scalaxb.fromXML[xb.Deep](XML.loadString(deep2))
  //
  //  @Benchmark
  //  def phobos_3 = XmlDecoder[PhobosDeep].decode(deep3)
  //  @Benchmark
  //  def scalaxb_3 = scalaxb.fromXML[xb.Deep](XML.loadString(deep3))
  //
  //  @Benchmark
  //  def phobos_5 = XmlDecoder[PhobosDeep].decode(deep5)
  //  @Benchmark
  //  def scalaxb_5 = scalaxb.fromXML[xb.Deep](XML.loadString(deep5))
  //
  //  @Benchmark
  //  def phobos_8 = XmlDecoder[PhobosDeep].decode(deep8)
  //  @Benchmark
  //  def scalaxb_8 = scalaxb.fromXML[xb.Deep](XML.loadString(deep8))
  //
  //  @Benchmark
  //  def phobos_13 = XmlDecoder[PhobosDeep].decode(deep13)
  //  @Benchmark
  //  def scalaxb_13 = scalaxb.fromXML[xb.Deep](XML.loadString(deep13))
  //
  //  @Benchmark
  //  def phobos_21 = XmlDecoder[PhobosDeep].decode(deep21)
  //  @Benchmark
  //  def scalaxb_21 = scalaxb.fromXML[xb.Deep](XML.loadString(deep21))
  //
  //  @Benchmark
  //  def phobos_34 = XmlDecoder[PhobosDeep].decode(deep34)
  //  @Benchmark
  //  def scalaxb_34 = scalaxb.fromXML[xb.Deep](XML.loadString(deep34))
  //
  //  @Benchmark
  //  def phobos_55 = XmlDecoder[PhobosDeep].decode(deep55)
  //  @Benchmark
  //  def scalaxb_55 = scalaxb.fromXML[xb.Deep](XML.loadString(deep55))
  //
  //  @Benchmark
  //  def phobos_89 = XmlDecoder[PhobosDeep].decode(deep89)
  //  @Benchmark
  //  def scalaxb_89 = scalaxb.fromXML[xb.Deep](XML.loadString(deep89))
  //
  //  @Benchmark
  //  def phobos_144 = XmlDecoder[PhobosDeep].decode(deep144)
  //  @Benchmark
  //  def scalaxb_144 = scalaxb.fromXML[xb.Deep](XML.loadString(deep144))
  //
  //  @Benchmark
  //  def phobos_233 = XmlDecoder[PhobosDeep].decode(deep233)
  //  @Benchmark
  //  def scalaxb_233 = scalaxb.fromXML[xb.Deep](XML.loadString(deep233))
  //
//  @Benchmark
//  def phobos_377 = XmlDecoder[PhobosDeep].decode(deep377)
//  @Benchmark
//  def scalaxb_377 = scalaxb.fromXML[xb.Deep](XML.loadString(deep377))

}
