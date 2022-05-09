package benchmarks.wide

import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder

import java.io.ByteArrayInputStream
import java.util.concurrent.TimeUnit
import javax.xml.bind.JAXBContext
import scala.xml.XML

@State(Scope.Benchmark)
@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 1, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Fork(1)
class WideBenchmark {
  private val wide1      = GenWideString.genWideString(1)
  private val wide2      = GenWideString.genWideString(2)
  private val wide3      = GenWideString.genWideString(3)
  private val wide5      = GenWideString.genWideString(5)
  private val wide8      = GenWideString.genWideString(8)
  private val wide13     = GenWideString.genWideString(13)
  private val wide21     = GenWideString.genWideString(21)
  private val wide34     = GenWideString.genWideString(34)
  private val wide55     = GenWideString.genWideString(55)
  private val wide89     = GenWideString.genWideString(89)
  private val wide144    = GenWideString.genWideString(144)
  private val wide233    = GenWideString.genWideString(233)
  private val wide377    = GenWideString.genWideString(377)
  private val wide610    = GenWideString.genWideString(610)
  private val wide987    = GenWideString.genWideString(987)
  private val wide1597   = GenWideString.genWideString(1597)
  private val wide2584   = GenWideString.genWideString(2584)
  private val wide4181   = GenWideString.genWideString(4181)
  private val wide6765   = GenWideString.genWideString(6765)
  private val wide10946  = GenWideString.genWideString(10946)
  private val wide17711  = GenWideString.genWideString(17711)
  private val wide28657  = GenWideString.genWideString(28657)
  private val wide46368  = GenWideString.genWideString(46368)
  private val wide75025  = GenWideString.genWideString(75025)
  private val wide121393 = GenWideString.genWideString(121393)

  @Benchmark
  def phobos_1 = XmlDecoder[PhobosWideItems].decode(wide1)
  @Benchmark
  def scalaxb_1 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide1))
  @Benchmark
  def jaxb_1 = {
    val context      = JAXBContext.newInstance(classOf[JaxbWideItems])
    val unmarshaller = context.createUnmarshaller()
    val wide         = unmarshaller.unmarshal(new ByteArrayInputStream(wide1.getBytes()))
    println(wide.asInstanceOf[JaxbWideItems])
    wide
  }
//
//  @Benchmark
//  def phobos_2 = XmlDecoder[PhobosWideItems].decode(wide2)
//  @Benchmark
//  def scalaxb_2 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide2))
//
//  @Benchmark
//  def phobos_3 = XmlDecoder[PhobosWideItems].decode(wide3)
//  @Benchmark
//  def scalaxb_3 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide3))
//
//  @Benchmark
//  def phobos_5 = XmlDecoder[PhobosWideItems].decode(wide5)
//  @Benchmark
//  def scalaxb_5 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide5))
//
//  @Benchmark
//  def phobos_8 = XmlDecoder[PhobosWideItems].decode(wide8)
//  @Benchmark
//  def scalaxb_8 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide8))
//
//  @Benchmark
//  def phobos_13 = XmlDecoder[PhobosWideItems].decode(wide13)
//  @Benchmark
//  def scalaxb_13 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide13))
//
//  @Benchmark
//  def phobos_21 = XmlDecoder[PhobosWideItems].decode(wide21)
//  @Benchmark
//  def scalaxb_21 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide21))
//
//  @Benchmark
//  def phobos_34 = XmlDecoder[PhobosWideItems].decode(wide34)
//  @Benchmark
//  def scalaxb_34 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide34))
//
//  @Benchmark
//  def phobos_55 = XmlDecoder[PhobosWideItems].decode(wide55)
//  @Benchmark
//  def scalaxb_55 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide55))
//
//  @Benchmark
//  def phobos_89 = XmlDecoder[PhobosWideItems].decode(wide89)
//  @Benchmark
//  def scalaxb_89 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide89))
//
//  @Benchmark
//  def phobos_144 = XmlDecoder[PhobosWideItems].decode(wide144)
//  @Benchmark
//  def scalaxb_144 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide144))
//
//  @Benchmark
//  def phobos_233 = XmlDecoder[PhobosWideItems].decode(wide233)
//  @Benchmark
//  def scalaxb_233 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide233))
//
//  @Benchmark
//  def phobos_377 = XmlDecoder[PhobosWideItems].decode(wide377)
//  @Benchmark
//  def scalaxb_377 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide377))
//
//  @Benchmark
//  def phobos_610 = XmlDecoder[PhobosWideItems].decode(wide610)
//  @Benchmark
//  def scalaxb_610 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide610))
//
//  @Benchmark
//  def phobos_987 = XmlDecoder[PhobosWideItems].decode(wide987)
//  @Benchmark
//  def scalaxb_987 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide987))
//
//  @Benchmark
//  def phobos_1597 = XmlDecoder[PhobosWideItems].decode(wide1597)
//  @Benchmark
//  def scalaxb_1597 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide1597))
//
//  @Benchmark
//  def phobos_2584 = XmlDecoder[PhobosWideItems].decode(wide2584)
//  @Benchmark
//  def scalaxb_2584 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide2584))
//
//  @Benchmark
//  def phobos_4181 = XmlDecoder[PhobosWideItems].decode(wide4181)
//  @Benchmark
//  def scalaxb_4181 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide4181))
//
//  @Benchmark
//  def phobos_6765 = XmlDecoder[PhobosWideItems].decode(wide6765)
//  @Benchmark
//  def scalaxb_6765 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide6765))
//
//  @Benchmark
//  def phobos_10946 = XmlDecoder[PhobosWideItems].decode(wide10946)
//  @Benchmark
//  def scalaxb_10946 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide10946))
//
//  @Benchmark
//  def phobos_17711 = XmlDecoder[PhobosWideItems].decode(wide17711)
//  @Benchmark
//  def scalaxb_17711 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide17711))
//
//  @Benchmark
//  def phobos_28657 = XmlDecoder[PhobosWideItems].decode(wide28657)
//  @Benchmark
//  def scalaxb_28657 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide28657))
//
//  @Benchmark
//  def phobos_46368 = XmlDecoder[PhobosWideItems].decode(wide46368)
//  @Benchmark
//  def scalaxb_46368 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide46368))
//
//  @Benchmark
//  def phobos_75025 = XmlDecoder[PhobosWideItems].decode(wide75025)
//  @Benchmark
//  def scalaxb_75025 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide75025))
//
//  @Benchmark
//  def phobos_121393 = XmlDecoder[PhobosWideItems].decode(wide121393)
//  @Benchmark
//  def scalaxb_121393 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide121393))
}
