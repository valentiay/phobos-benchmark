package benchmarks.wide

import org.openjdk.jmh.annotations._
import ru.tinkoff.phobos.decoding.XmlDecoder
import benchmarks.wide.data._

import java.io.StringReader
import java.util.concurrent.TimeUnit
import scala.xml.XML

@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 3, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 5, timeUnit = TimeUnit.SECONDS)
@Fork(1)
class WideBenchmark {
  @Benchmark
  def phobos_1 = XmlDecoder[PhobosWideItems].decode(wide1)
  @Benchmark
  def scalaxb_1 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide1))
  @Benchmark
  def jaxb_1 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide1)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_2 = XmlDecoder[PhobosWideItems].decode(wide2)
  @Benchmark
  def scalaxb_2 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide2))
  @Benchmark
  def jaxb_2 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide2)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_3 = XmlDecoder[PhobosWideItems].decode(wide3)
  @Benchmark
  def scalaxb_3 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide3))
  @Benchmark
  def jaxb_3 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide3)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_5 = XmlDecoder[PhobosWideItems].decode(wide5)
  @Benchmark
  def scalaxb_5 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide5))
  @Benchmark
  def jaxb_5 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide5)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_8 = XmlDecoder[PhobosWideItems].decode(wide8)
  @Benchmark
  def scalaxb_8 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide8))
  @Benchmark
  def jaxb_8 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide8)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_13 = XmlDecoder[PhobosWideItems].decode(wide13)
  @Benchmark
  def scalaxb_13 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide13))
  @Benchmark
  def jaxb_13 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide13)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_21 = XmlDecoder[PhobosWideItems].decode(wide21)
  @Benchmark
  def scalaxb_21 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide21))
  @Benchmark
  def jaxb_21 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide21)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_34 = XmlDecoder[PhobosWideItems].decode(wide34)
  @Benchmark
  def scalaxb_34 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide34))
  @Benchmark
  def jaxb_34 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide34)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_55 = XmlDecoder[PhobosWideItems].decode(wide55)
  @Benchmark
  def scalaxb_55 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide55))
  @Benchmark
  def jaxb_55 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide55)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_89 = XmlDecoder[PhobosWideItems].decode(wide89)
  @Benchmark
  def scalaxb_89 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide89))
  @Benchmark
  def jaxb_89 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide89)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_144 = XmlDecoder[PhobosWideItems].decode(wide144)
  @Benchmark
  def scalaxb_144 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide144))
  @Benchmark
  def jaxb_144 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide144)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_233 = XmlDecoder[PhobosWideItems].decode(wide233)
  @Benchmark
  def scalaxb_233 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide233))
  @Benchmark
  def jaxb_233 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide233)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_377 = XmlDecoder[PhobosWideItems].decode(wide377)
  @Benchmark
  def scalaxb_377 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide377))
  @Benchmark
  def jaxb_377 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide377)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_610 = XmlDecoder[PhobosWideItems].decode(wide610)
  @Benchmark
  def scalaxb_610 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide610))
  @Benchmark
  def jaxb_610 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide610)).asInstanceOf[JaxbWideItems]

  @Benchmark
  def phobos_987 = XmlDecoder[PhobosWideItems].decode(wide987)
  @Benchmark
  def scalaxb_987 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide987))
  @Benchmark
  def jaxb_987 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide987)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_1597 = XmlDecoder[PhobosWideItems].decode(wide1597)
//  @Benchmark
//  def scalaxb_1597 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide1597))
//  @Benchmark
//  def jaxb_1597 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide1597)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_2584 = XmlDecoder[PhobosWideItems].decode(wide2584)
//  @Benchmark
//  def scalaxb_2584 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide2584))
//  @Benchmark
//  def jaxb_2584 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide2584)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_4181 = XmlDecoder[PhobosWideItems].decode(wide4181)
//  @Benchmark
//  def scalaxb_4181 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide4181))
//  @Benchmark
//  def jaxb_4181 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide4181)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_6765 = XmlDecoder[PhobosWideItems].decode(wide6765)
//  @Benchmark
//  def scalaxb_6765 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide6765))
//  @Benchmark
//  def jaxb_6765 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide6765)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_10946 = XmlDecoder[PhobosWideItems].decode(wide10946)
//  @Benchmark
//  def scalaxb_10946 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide10946))
//  @Benchmark
//  def jaxb_10946 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide10946)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_17711 = XmlDecoder[PhobosWideItems].decode(wide17711)
//  @Benchmark
//  def scalaxb_17711 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide17711))
//  @Benchmark
//  def jaxb_17711 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide17711)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_28657 = XmlDecoder[PhobosWideItems].decode(wide28657)
//  @Benchmark
//  def scalaxb_28657 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide28657))
//  @Benchmark
//  def jaxb_28657 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide28657)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_46368 = XmlDecoder[PhobosWideItems].decode(wide46368)
//  @Benchmark
//  def scalaxb_46368 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide46368))
//  @Benchmark
//  def jaxb_46368 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide46368)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_75025 = XmlDecoder[PhobosWideItems].decode(wide75025)
//  @Benchmark
//  def scalaxb_75025 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide75025))
//  @Benchmark
//  def jaxb_75025 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide75025)).asInstanceOf[JaxbWideItems]

//
//  @Benchmark
//  def phobos_121393 = XmlDecoder[PhobosWideItems].decode(wide121393)
//  @Benchmark
//  def scalaxb_121393 = scalaxb.fromXML[xb.WideItems](XML.loadString(wide121393))
//  @Benchmark
//  def jaxb_121393 = JaxbWideItems.unmarshaller.unmarshal(new StringReader(wide121393)).asInstanceOf[JaxbWideItems]

}
