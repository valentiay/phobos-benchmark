package benchmarks.balanced

import java.util.concurrent.TimeUnit
import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder
import scala.xml.XML

@State(Scope.Benchmark)
@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
class BalancedBenchmark {
//  private val balanced1      = GenBalancedString.genBalancedString(1)
//  private val balanced2      = GenBalancedString.genBalancedString(2)
//  private val balanced3      = GenBalancedString.genBalancedString(3)
//  private val balanced5      = GenBalancedString.genBalancedString(5)
//  private val balanced8      = GenBalancedString.genBalancedString(8)
//  private val balanced13     = GenBalancedString.genBalancedString(13)
//  private val balanced21     = GenBalancedString.genBalancedString(21)
//  private val balanced34     = GenBalancedString.genBalancedString(34)
//  private val balanced55     = GenBalancedString.genBalancedString(55)
//  private val balanced89     = GenBalancedString.genBalancedString(89)
//  private val balanced144    = GenBalancedString.genBalancedString(144)
//  private val balanced233    = GenBalancedString.genBalancedString(233)
//  private val balanced377    = GenBalancedString.genBalancedString(377)
//  private val balanced610    = GenBalancedString.genBalancedString(610)
//  private val balanced987    = GenBalancedString.genBalancedString(987)
//  private val balanced1597   = GenBalancedString.genBalancedString(1597)
//  private val balanced2584   = GenBalancedString.genBalancedString(2584)
//  private val balanced4181   = GenBalancedString.genBalancedString(4181)
//  private val balanced6765   = GenBalancedString.genBalancedString(6765)
//  private val balanced10946  = GenBalancedString.genBalancedString(10946)
//  private val balanced17711  = GenBalancedString.genBalancedString(17711)
//  private val balanced28657  = GenBalancedString.genBalancedString(28657)
//  private val balanced46368  = GenBalancedString.genBalancedString(46368)
//  private val balanced75025  = GenBalancedString.genBalancedString(75025)
//  private val balanced121393 = GenBalancedString.genBalancedString(121393)

//  @Benchmark
//  def phobos_1 = XmlDecoder[PhobosBalancedItems].decode(balanced1)
//  @Benchmark
//  def scalaxb_1 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced1))
//
//  @Benchmark
//  def phobos_2 = XmlDecoder[PhobosBalancedItems].decode(balanced2)
//  @Benchmark
//  def scalaxb_2 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced2))

//  @Benchmark
//  def phobos_3 = XmlDecoder[PhobosBalancedItems].decode(balanced3)
//  @Benchmark
//  def scalaxb_3 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced3))
  //
  //  @Benchmark
  //  def phobos_5 = XmlDecoder[PhobosBalancedItems].decode(balanced5)
  //  @Benchmark
  //  def scalaxb_5 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced5))
  //
  //  @Benchmark
  //  def phobos_8 = XmlDecoder[PhobosBalancedItems].decode(balanced8)
  //  @Benchmark
  //  def scalaxb_8 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced8))
  //
  //  @Benchmark
  //  def phobos_13 = XmlDecoder[PhobosBalancedItems].decode(balanced13)
  //  @Benchmark
  //  def scalaxb_13 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced13))
  //
  //  @Benchmark
  //  def phobos_21 = XmlDecoder[PhobosBalancedItems].decode(balanced21)
  //  @Benchmark
  //  def scalaxb_21 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced21))
  //
  //  @Benchmark
  //  def phobos_34 = XmlDecoder[PhobosBalancedItems].decode(balanced34)
  //  @Benchmark
  //  def scalaxb_34 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced34))
  //
  //  @Benchmark
  //  def phobos_55 = XmlDecoder[PhobosBalancedItems].decode(balanced55)
  //  @Benchmark
  //  def scalaxb_55 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced55))
  //
  //  @Benchmark
  //  def phobos_89 = XmlDecoder[PhobosBalancedItems].decode(balanced89)
  //  @Benchmark
  //  def scalaxb_89 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced89))
  //
  //  @Benchmark
  //  def phobos_144 = XmlDecoder[PhobosBalancedItems].decode(balanced144)
  //  @Benchmark
  //  def scalaxb_144 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced144))
  //
  //  @Benchmark
  //  def phobos_233 = XmlDecoder[PhobosBalancedItems].decode(balanced233)
  //  @Benchmark
  //  def scalaxb_233 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced233))
  //
  //  @Benchmark
  //  def phobos_377 = XmlDecoder[PhobosBalancedItems].decode(balanced377)
  //  @Benchmark
  //  def scalaxb_377 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced377))
  //
  //  @Benchmark
  //  def phobos_610 = XmlDecoder[PhobosBalancedItems].decode(balanced610)
  //  @Benchmark
  //  def scalaxb_610 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced610))
  //
  //  @Benchmark
  //  def phobos_987 = XmlDecoder[PhobosBalancedItems].decode(balanced987)
  //  @Benchmark
  //  def scalaxb_987 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced987))
  //
  //  @Benchmark
  //  def phobos_1597 = XmlDecoder[PhobosBalancedItems].decode(balanced1597)
  //  @Benchmark
  //  def scalaxb_1597 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced1597))
  //
  //  @Benchmark
  //  def phobos_2584 = XmlDecoder[PhobosBalancedItems].decode(balanced2584)
  //  @Benchmark
  //  def scalaxb_2584 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced2584))
  //
  //  @Benchmark
  //  def phobos_4181 = XmlDecoder[PhobosBalancedItems].decode(balanced4181)
  //  @Benchmark
  //  def scalaxb_4181 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced4181))
  //
  //  @Benchmark
  //  def phobos_6765 = XmlDecoder[PhobosBalancedItems].decode(balanced6765)
  //  @Benchmark
  //  def scalaxb_6765 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced6765))
  //
//    @Benchmark
//    def phobos_10946 = XmlDecoder[PhobosBalancedItems].decode(balanced10946)
//    @Benchmark
//    def scalaxb_10946 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced10946))
  //  @Benchmark
  //  def phobos_17711 = XmlDecoder[PhobosBalancedItems].decode(balanced17711)
  //  @Benchmark
  //  def scalaxb_17711 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced17711))
  //
  //  @Benchmark
  //  def phobos_28657 = XmlDecoder[PhobosBalancedItems].decode(balanced28657)
  //  @Benchmark
  //  def scalaxb_28657 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced28657))
  //
  //  @Benchmark
  //  def phobos_46368 = XmlDecoder[PhobosBalancedItems].decode(balanced46368)
  //  @Benchmark
  //  def scalaxb_46368 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced46368))
  //
  //  @Benchmark
  //  def phobos_75025 = XmlDecoder[PhobosBalancedItems].decode(balanced75025)
  //  @Benchmark
  //  def scalaxb_75025 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced75025))
  //
//  @Benchmark
//  def phobos_121393 = XmlDecoder[PhobosBalancedItems].decode(balanced121393)
//  @Benchmark
//  def scalaxb_121393 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced121393))
}
