package phobos.ipo

import phobos.ipo.namespaces.ipo1
import ru.tinkoff.phobos.annotations.{ElementCodec, XmlCodecNs}
import ru.tinkoff.phobos.syntax._

//@XmlCodecNs("PurchaseOrderType", ipo1)
@XmlCodecNs("PurchaseOrderType", ipo1)
case class PurchaseOrderType(
    @attr orderDate: Option[String],
    shipTo: Address,
    billTo: Address,
    items: Items,
    @xmlns(ipo1) comment: Option[String],
)

@ElementCodec
case class Items(item: List[Item])
@ElementCodec
case class Item(
    @attr partNum: String,
    productName: String,
    quantity: Int,
    USPrice: Double,
    @xmlns(ipo1) comment: Option[String],
    shipDate: Option[String],
)
@ElementCodec
case class Address(
    name: String,
    street: String,
    city: String,
)
