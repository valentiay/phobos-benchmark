import org.scalameter.Bench
import phobos.order.{Item, Items, PurchaseOrderType, USAddress}
import ru.tinkoff.phobos.decoding.XmlDecoder
import ru.tinkoff.phobos.encoding.XmlEncoder

import scala.util.Random
import scala.xml.{Elem, NodeSeq, XML}

object Test {

  val alphanumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

  def randomString: String =
    List.fill(Random.nextInt(20))(alphanumeric.charAt(Random.nextInt(alphanumeric.length))).mkString

  def genItem: Item =
    Item(
      partNum = randomString,
      productName = randomString,
      quantity = Random.nextInt(),
      USPrice = Random.nextDouble(),
      comment = Some(randomString),
      shipDate = Some(randomString),
    )

  def genOrder(n: Int) =
    PurchaseOrderType(
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

  def measure[A](test: => A): Double = {
    // warmup
    test
    test

    val start = System.nanoTime()
    test
    val end = System.nanoTime()
    (end - start) / 1000000
  }

  def testSingle(n: Int): Unit = {
    val purchaseOrder = genOrder(n)
    val string = XmlEncoder[PurchaseOrderType].encode(purchaseOrder)

    val phobosTime = measure(XmlDecoder[PurchaseOrderType].decode(string))
    val xbTime = measure(scalaxb.fromXML[xb.PurchaseOrderType](XML.loadString(string)))

    println(s"$n :: phobos time: $phobosTime ms :: scalaxb time $xbTime ms :: ratio ${xbTime / phobosTime}")
  }

  def main(args: Array[String]): Unit = {
    val step = 1000
    for (i <- 1 to 100) testSingle(step * i)
  }
}
