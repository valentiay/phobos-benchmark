package benchmarks.balanced

import benchmarks.balanced.data._
import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder

import java.io.StringReader
import java.util.concurrent.TimeUnit
import scala.xml.XML

@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 10, time = 10, timeUnit = TimeUnit.SECONDS)
@Fork(3)
class BalancedBenchmark {
  @Benchmark
  def phobos2_1 = XmlDecoder[PhobosBalancedItems].decode(balanced1)
  @Benchmark
  def scalaxb_1 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced1))
  @Benchmark
  def jaxb_1 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced1)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_2 = XmlDecoder[PhobosBalancedItems].decode(balanced2)
  @Benchmark
  def scalaxb_2 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced2))
  @Benchmark
  def jaxb_2 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced2)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_3 = XmlDecoder[PhobosBalancedItems].decode(balanced3)
  @Benchmark
  def scalaxb_3 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced3))
  @Benchmark
  def jaxb_3 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced3)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_5 = XmlDecoder[PhobosBalancedItems].decode(balanced5)
  @Benchmark
  def scalaxb_5 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced5))
  @Benchmark
  def jaxb_5 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced5)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_8 = XmlDecoder[PhobosBalancedItems].decode(balanced8)
  @Benchmark
  def scalaxb_8 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced8))
  @Benchmark
  def jaxb_8 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced8)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_13 = XmlDecoder[PhobosBalancedItems].decode(balanced13)
  @Benchmark
  def scalaxb_13 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced13))
  @Benchmark
  def jaxb_13 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced13)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_21 = XmlDecoder[PhobosBalancedItems].decode(balanced21)
  @Benchmark
  def scalaxb_21 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced21))
  @Benchmark
  def jaxb_21 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced21)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_34 = XmlDecoder[PhobosBalancedItems].decode(balanced34)
  @Benchmark
  def scalaxb_34 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced34))
  @Benchmark
  def jaxb_34 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced34)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_55 = XmlDecoder[PhobosBalancedItems].decode(balanced55)
  @Benchmark
  def scalaxb_55 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced55))
  @Benchmark
  def jaxb_55 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced55)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_89 = XmlDecoder[PhobosBalancedItems].decode(balanced89)
  @Benchmark
  def scalaxb_89 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced89))
  @Benchmark
  def jaxb_89 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced89)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_144 = XmlDecoder[PhobosBalancedItems].decode(balanced144)
  @Benchmark
  def scalaxb_144 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced144))
  @Benchmark
  def jaxb_144 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced144)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_233 = XmlDecoder[PhobosBalancedItems].decode(balanced233)
  @Benchmark
  def scalaxb_233 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced233))
  @Benchmark
  def jaxb_233 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced233)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_377 = XmlDecoder[PhobosBalancedItems].decode(balanced377)
  @Benchmark
  def scalaxb_377 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced377))
  @Benchmark
  def jaxb_377 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced377)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_610 = XmlDecoder[PhobosBalancedItems].decode(balanced610)
  @Benchmark
  def scalaxb_610 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced610))
  @Benchmark
  def jaxb_610 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced610)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_987 = XmlDecoder[PhobosBalancedItems].decode(balanced987)
  @Benchmark
  def scalaxb_987 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced987))
  @Benchmark
  def jaxb_987 = JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced987)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_1597 = XmlDecoder[PhobosBalancedItems].decode(balanced1597)
  @Benchmark
  def scalaxb_1597 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced1597))
  @Benchmark
  def jaxb_1597 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced1597)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_2584 = XmlDecoder[PhobosBalancedItems].decode(balanced2584)
  @Benchmark
  def scalaxb_2584 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced2584))
  @Benchmark
  def jaxb_2584 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced2584)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_4181 = XmlDecoder[PhobosBalancedItems].decode(balanced4181)
  @Benchmark
  def scalaxb_4181 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced4181))
  @Benchmark
  def jaxb_4181 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced4181)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_6765 = XmlDecoder[PhobosBalancedItems].decode(balanced6765)
  @Benchmark
  def scalaxb_6765 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced6765))
  @Benchmark
  def jaxb_6765 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced6765)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_10946 = XmlDecoder[PhobosBalancedItems].decode(balanced10946)
  @Benchmark
  def scalaxb_10946 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced10946))
  @Benchmark
  def phobos2_17711 = XmlDecoder[PhobosBalancedItems].decode(balanced17711)
  @Benchmark
  def scalaxb_17711 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced17711))
  @Benchmark
  def jaxb_17711 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced17711)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_28657 = XmlDecoder[PhobosBalancedItems].decode(balanced28657)
  @Benchmark
  def scalaxb_28657 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced28657))
  @Benchmark
  def jaxb_28657 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced28657)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_46368 = XmlDecoder[PhobosBalancedItems].decode(balanced46368)
  @Benchmark
  def scalaxb_46368 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced46368))
  @Benchmark
  def jaxb_46368 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced46368)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_75025 = XmlDecoder[PhobosBalancedItems].decode(balanced75025)
  @Benchmark
  def scalaxb_75025 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced75025))
  @Benchmark
  def jaxb_75025 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced75025)).asInstanceOf[JaxbBalancedItems]

  @Benchmark
  def phobos2_121393 = XmlDecoder[PhobosBalancedItems].decode(balanced121393)
  @Benchmark
  def scalaxb_121393 = scalaxb.fromXML[xb.BalancedItems](XML.loadString(balanced121393))
  @Benchmark
  def jaxb_121393 =
    JaxbBalancedItems.unmarshaller.unmarshal(new StringReader(balanced121393)).asInstanceOf[JaxbBalancedItems]
}
