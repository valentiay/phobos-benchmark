package benchmarks.deep

import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder

import java.io.StringReader
import scala.xml.XML
import benchmarks.deep.data._

import java.util.concurrent.TimeUnit

@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(1)
class DeepBenchmark {

  @Benchmark
  def phobos2_1 = XmlDecoder[PhobosDeep].decode(deep1)
  @Benchmark
  def scalaxb_1 = scalaxb.fromXML[xb.Deep](XML.loadString(deep1))
  @Benchmark
  def jaxb_1 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep1)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_2 = XmlDecoder[PhobosDeep].decode(deep2)
  @Benchmark
  def scalaxb_2 = scalaxb.fromXML[xb.Deep](XML.loadString(deep2))
  @Benchmark
  def jaxb_2 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep2)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_3 = XmlDecoder[PhobosDeep].decode(deep3)
  @Benchmark
  def scalaxb_3 = scalaxb.fromXML[xb.Deep](XML.loadString(deep3))
  @Benchmark
  def jaxb_3 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep3)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_5 = XmlDecoder[PhobosDeep].decode(deep5)
  @Benchmark
  def scalaxb_5 = scalaxb.fromXML[xb.Deep](XML.loadString(deep5))
  @Benchmark
  def jaxb_5 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep5)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_8 = XmlDecoder[PhobosDeep].decode(deep8)
  @Benchmark
  def scalaxb_8 = scalaxb.fromXML[xb.Deep](XML.loadString(deep8))
  @Benchmark
  def jaxb_8 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep8)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_13 = XmlDecoder[PhobosDeep].decode(deep13)
  @Benchmark
  def scalaxb_13 = scalaxb.fromXML[xb.Deep](XML.loadString(deep13))
  @Benchmark
  def jaxb_13 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep13)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_21 = XmlDecoder[PhobosDeep].decode(deep21)
  @Benchmark
  def scalaxb_21 = scalaxb.fromXML[xb.Deep](XML.loadString(deep21))
  @Benchmark
  def jaxb_21 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep21)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_34 = XmlDecoder[PhobosDeep].decode(deep34)
  @Benchmark
  def scalaxb_34 = scalaxb.fromXML[xb.Deep](XML.loadString(deep34))
  @Benchmark
  def jaxb_34 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep34)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_55 = XmlDecoder[PhobosDeep].decode(deep55)
  @Benchmark
  def scalaxb_55 = scalaxb.fromXML[xb.Deep](XML.loadString(deep55))
  @Benchmark
  def jaxb_55 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep55)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_89 = XmlDecoder[PhobosDeep].decode(deep89)
  @Benchmark
  def scalaxb_89 = scalaxb.fromXML[xb.Deep](XML.loadString(deep89))
  @Benchmark
  def jaxb_89 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep89)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_144 = XmlDecoder[PhobosDeep].decode(deep144)
  @Benchmark
  def scalaxb_144 = scalaxb.fromXML[xb.Deep](XML.loadString(deep144))
  @Benchmark
  def jaxb_144 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep144)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_233 = XmlDecoder[PhobosDeep].decode(deep233)
  @Benchmark
  def scalaxb_233 = scalaxb.fromXML[xb.Deep](XML.loadString(deep233))
  @Benchmark
  def jaxb_233 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep233)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_377 = XmlDecoder[PhobosDeep].decode(deep377)
  @Benchmark
  def scalaxb_377 = scalaxb.fromXML[xb.Deep](XML.loadString(deep377))
  @Benchmark
  def jaxb_377 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep377)).asInstanceOf[JaxbDeep]

  @Benchmark
  def phobos2_500 = XmlDecoder[PhobosDeep].decode(deep500)
  @Benchmark
  def scalaxb_500 = scalaxb.fromXML[xb.Deep](XML.loadString(deep500))
  @Benchmark
  def jaxb_500 = JaxbDeep.unmarshaller.unmarshal(new StringReader(deep500)).asInstanceOf[JaxbDeep]
}
