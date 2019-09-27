package benchmarking

import java.util.concurrent.TimeUnit

import org.openjdk.jmh.annotations._
import phobos.po.{Item, Items, PurchaseOrderType, USAddress}
import ru.tinkoff.phobos.decoding.XmlDecoder
import ru.tinkoff.phobos.encoding.XmlEncoder

import scala.util.Random
import scala.xml.XML

@State(Scope.Thread)
@BenchmarkMode(Array(Mode.AverageTime))
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Measurement(iterations = 10, time = 1, timeUnit = TimeUnit.MILLISECONDS)
@Fork(2)
class PurchaseOrderBenchmark {
  val stringLength = 20

  def genItem: Item =
    Item(
      partNum = utils.randomString(stringLength),
      productName = utils.randomString(stringLength),
      quantity = Random.nextInt(),
      USPrice = Random.nextDouble(),
      comment = Some(utils.randomString(stringLength)),
      shipDate = Some(utils.randomString(stringLength)),
    )

  def genOrder(n: Int): String = {
    val purchaseOrder = PurchaseOrderType(
      orderDate = "1999-10-20",
      shipTo = USAddress(
        country = "US",
        name = "Alice Smith",
        street = "123 Marple Street",
        city = "Mill Valley",
        state = "CA",
        zip = 90952,
      ),
      billTo = USAddress(
        country = "US",
        name = "Robert Smith",
        street = "8 Oak Avenue",
        city = "Old Town",
        state = "PA",
        zip = 95819,
      ),
      comment = Some("Hurry, my lawn is going wild!"),
      items = Items(item = List.fill(n)(genItem))
    )
    XmlEncoder[phobos.po.PurchaseOrderType].encode(purchaseOrder)
  }

  val purchaseOrder0: String     = genOrder(0)
  val purchaseOrder125: String   = genOrder(125)
  val purchaseOrder250: String   = genOrder(250)
  val purchaseOrder500: String   = genOrder(500)
  val purchaseOrder1000: String  = genOrder(1000)
  val purchaseOrder2000: String  = genOrder(2000)
  val purchaseOrder3000: String  = genOrder(3000)
  val purchaseOrder4000: String  = genOrder(4000)
  val purchaseOrder5000: String  = genOrder(5000)
  val purchaseOrder6000: String  = genOrder(6000)
  val purchaseOrder7000: String  = genOrder(7000)
  val purchaseOrder8000: String  = genOrder(8000)
  val purchaseOrder9000: String  = genOrder(9000)
  val purchaseOrder10000: String = genOrder(10000)
  val purchaseOrder11000: String = genOrder(11000)
  val purchaseOrder12000: String = genOrder(12000)
  val purchaseOrder13000: String = genOrder(13000)
  val purchaseOrder14000: String = genOrder(14000)
  val purchaseOrder15000: String = genOrder(15000)
  val purchaseOrder16000: String = genOrder(16000)
  val purchaseOrder17000: String = genOrder(17000)
  val purchaseOrder18000: String = genOrder(18000)
  val purchaseOrder19000: String = genOrder(19000)
  val purchaseOrder20000: String = genOrder(20000)
  val purchaseOrder21000: String = genOrder(21000)
  val purchaseOrder22000: String = genOrder(22000)
  val purchaseOrder23000: String = genOrder(23000)
  val purchaseOrder24000: String = genOrder(24000)
  val purchaseOrder25000: String = genOrder(25000)
  @Benchmark
  def phobos0 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder0)
  @Benchmark
  def xb0 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder0))

  @Benchmark
  def phobos125 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder125)
  @Benchmark
  def xb125 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder125))

  def phobos250 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder250)
  @Benchmark
  def xb250 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder250))

  def phobos500 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder500)
  @Benchmark
  def xb500 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder500))

  @Benchmark
  def phobos1000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder1000)
  @Benchmark
  def xb1000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder1000))

  @Benchmark
  def phobos2000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder2000)
  @Benchmark
  def xb2000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder2000))

  @Benchmark
  def phobos3000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder3000)
  @Benchmark
  def xb3000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder3000))

  @Benchmark
  def phobos4000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder4000)
  @Benchmark
  def xb4000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder4000))

  @Benchmark
  def phobos5000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder5000)
  @Benchmark
  def xb5000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder5000))

  @Benchmark
  def phobos6000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder6000)
  @Benchmark
  def xb6000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder6000))

  @Benchmark
  def phobos7000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder7000)
  @Benchmark
  def xb7000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder7000))

  @Benchmark
  def phobos8000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder8000)
  @Benchmark
  def xb8000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder8000))

  @Benchmark
  def phobos9000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder9000)
  @Benchmark
  def xb9000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder9000))

  @Benchmark
  def phobos10000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder10000)
  @Benchmark
  def xb10000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder10000))

  @Benchmark
  def phobos11000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder11000)
  @Benchmark
  def xb11000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder11000))

  @Benchmark
  def phobos12000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder12000)
  @Benchmark
  def xb12000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder12000))

  @Benchmark
  def phobos13000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder13000)
  @Benchmark
  def xb13000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder13000))

  @Benchmark
  def phobos14000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder14000)
  @Benchmark
  def xb14000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder14000))

  @Benchmark
  def phobos15000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder15000)
  @Benchmark
  def xb15000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder15000))

  @Benchmark
  def phobos16000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder16000)
  @Benchmark
  def xb16000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder16000))

  @Benchmark
  def phobos17000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder17000)
  @Benchmark
  def xb17000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder17000))

  @Benchmark
  def phobos18000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder18000)
  @Benchmark
  def xb18000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder18000))

  @Benchmark
  def phobos19000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder19000)
  @Benchmark
  def xb19000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder19000))

  @Benchmark
  def phobos20000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder20000)
  @Benchmark
  def xb20000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder20000))

  @Benchmark
  def phobos21000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder21000)
  @Benchmark
  def xb21000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder21000))

  @Benchmark
  def phobos22000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder22000)
  @Benchmark
  def xb22000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder22000))

  @Benchmark
  def phobos23000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder23000)
  @Benchmark
  def xb23000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder23000))

  @Benchmark
  def phobos24000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder24000)
  @Benchmark
  def xb24000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder24000))

  @Benchmark
  def phobos25000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder25000)
  @Benchmark
  def xb25000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder25000))

}
