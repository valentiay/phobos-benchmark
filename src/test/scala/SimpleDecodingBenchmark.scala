import phobos.po.{Item, Items, PurchaseOrderType, USAddress}
import ru.tinkoff.phobos.encoding.XmlEncoder

import scala.util.Random

object SimpleDecodingBenchmark {
  val testName = "SimpleDecoding"

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
    XmlEncoder[PurchaseOrderType].encode(purchaseOrder)
  }

  def main(args: Array[String]): Unit = {
    benchmark.testDecoding[phobos.po.PurchaseOrderType, xb.PurchaseOrderType](testName, args, genOrder)
  }
}
