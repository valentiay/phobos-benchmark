package phobos

import ru.tinkoff.phobos.annotations.{ElementCodec, XmlCodec}
import ru.tinkoff.phobos.syntax.attr

object po {

  @XmlCodec("purchaseOrder")
  case class PurchaseOrderType(
                                @attr orderDate: String,
                                shipTo: USAddress,
                                billTo: USAddress,
                                comment: Option[String],
                                items: Items,
                              )

  @ElementCodec
  case class USAddress(
                        @attr country: String,
                        name: String,
                        street: String,
                        city: String,
                        state: String,
                        zip: BigDecimal,
                      )


  @ElementCodec
  case class Item(
                   @attr partNum: String,
                   productName: String,
                   quantity: BigInt,
                   USPrice: BigDecimal,
                   comment: Option[String],
                   shipDate: Option[String],
                 )


  @ElementCodec
  case class Items(item: List[Item])

}
