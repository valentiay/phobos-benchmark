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

  val purchaseOrder0: String = genOrder(0)
  val purchaseOrder1: String = genOrder(1)
  val purchaseOrder2: String = genOrder(2)
  val purchaseOrder5: String = genOrder(5)
  val purchaseOrder8: String = genOrder(8)
  val purchaseOrder10: String = genOrder(10)
  val purchaseOrder25: String = genOrder(25)
  val purchaseOrder50: String = genOrder(50)
  val purchaseOrder75: String = genOrder(75)
  val purchaseOrder100: String = genOrder(100)
  val purchaseOrder250: String = genOrder(250)
  val purchaseOrder500: String = genOrder(500)
  val purchaseOrder750: String = genOrder(750)
  val purchaseOrder1000: String = genOrder(1000)
  val purchaseOrder2500: String = genOrder(2500)
  val purchaseOrder5000: String = genOrder(5000)
  val purchaseOrder7500: String = genOrder(7500)
  val purchaseOrder10000: String = genOrder(10000)
  val purchaseOrder25000: String = genOrder(25000)
  val purchaseOrder50000: String = genOrder(50000)
  val purchaseOrder75000: String = genOrder(75000)
  val purchaseOrder100000: String = genOrder(100000)

  @Benchmark
  def phobos0 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder0)
  @Benchmark
  def xb0 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder0))

  @Benchmark
  def phobos1 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder1)
  @Benchmark
  def xb1 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder1))

  @Benchmark
  def phobos2 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder2)
  @Benchmark
  def xb2 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder2))

  @Benchmark
  def phobos5 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder5)
  @Benchmark
  def xb5 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder5))

  @Benchmark
  def phobos8 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder8)
  @Benchmark
  def xb8 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder8))

  @Benchmark
  def phobos10 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder10)
  @Benchmark
  def xb10 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder10))

  @Benchmark
  def phobos25 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder25)
  @Benchmark
  def xb25 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder25))

  @Benchmark
  def phobos50 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder50)
  @Benchmark
  def xb50 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder50))

  @Benchmark
  def phobos75 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder75)
  @Benchmark
  def xb75 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder75))

  @Benchmark
  def phobos100 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder100)
  @Benchmark
  def xb100 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder100))

  @Benchmark
  def phobos250 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder250)
  @Benchmark
  def xb250 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder250))

  @Benchmark
  def phobos500 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder500)
  @Benchmark
  def xb500 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder500))

  @Benchmark
  def phobos750 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder750)
  @Benchmark
  def xb750 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder750))

  @Benchmark
  def phobos1000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder1000)
  @Benchmark
  def xb1000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder1000))

  @Benchmark
  def phobos2500 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder2500)
  @Benchmark
  def xb2500 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder2500))

  @Benchmark
  def phobos5000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder5000)
  @Benchmark
  def xb5000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder5000))

  @Benchmark
  def phobos7500 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder7500)
  @Benchmark
  def xb7500 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder7500))

  @Benchmark
  def phobos10000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder10000)
  @Benchmark
  def xb10000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder10000))

  @Benchmark
  def phobos25000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder25000)
  @Benchmark
  def xb25000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder25000))

  @Benchmark
  def phobos50000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder50000)
  @Benchmark
  def xb50000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder50000))

  @Benchmark
  def phobos75000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder75000)
  @Benchmark
  def xb75000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder75000))

  @Benchmark
  def phobos100000 = XmlDecoder[phobos.po.PurchaseOrderType].decode(purchaseOrder100000)
  @Benchmark
  def xb100000 = scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(purchaseOrder100000))

}
