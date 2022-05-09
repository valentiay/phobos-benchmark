package benchmarks.wide

import javax.xml.bind.annotation.XmlAttribute

case class JaxbWideItems(
    WideItem: List[PhobosWide],
)

//object PhobosWideItems {
//  implicit val phobosWideItemsDecoder: XmlDecoder[PhobosWideItems] = deriveXmlDecoder("WideItems")
//}

case class JaxbWide(
    @XmlAttribute foobarqux: Short,
    @XmlAttribute fooquxbar: Int,
    @XmlAttribute barfooqux: Long,
    @XmlAttribute barquxfoo: Boolean,
    @XmlAttribute quxfoobar: String,
    @XmlAttribute quxbarfoo: String,
    @XmlAttribute foobarbaz: Short,
    @XmlAttribute foobazbar: Int,
    @XmlAttribute barfoobaz: Long,
    @XmlAttribute barbazfoo: Boolean,
    bazfoobar: String,
    bazbarfoo: String,
    foobarbat: Short,
    foobatbar: Int,
    barfoobat: Long,
    barbatfoo: String,
    batfoobar: Boolean,
    batbarfoo: String,
    fooquxbaz: Short,
    foobazqux: Int,
    quxfoobaz: Long,
    quxbazfoo: String,
    bazfooqux: String,
    bazquxfoo: Boolean,
    fooquxbat: Short,
    foobatqux: Int,
    quxfoobat: Long,
    quxbatfoo: String,
    batfooqux: Boolean,
    batquxfoo: String,
    foobazbat: Short,
    foobatbaz: Int,
    bazfoobat: Long,
    bazbatfoo: String,
    batfoobaz: String,
    batbazfoo: Boolean,
    barquxbaz: Short,
    barbazqux: Int,
    quxbarbaz: Boolean,
    quxbazbar: Long,
    bazbarqux: String,
    bazquxbar: String,
    barquxbat: Short,
    barbatqux: Int,
    quxbarbat: Boolean,
    quxbatbar: Long,
    batbarqux: String,
    batquxbar: String,
    barbazbat: Short,
    barbatbaz: Int,
    bazbarbat: Boolean,
    bazbatbar: String,
    batbarbaz: Long,
    batbazbar: String,
    quxbazbat: Short,
    quxbatbaz: Int,
    bazquxbat: Boolean,
    bazbatqux: String,
    batquxbaz: String,
    batbazqux: Long,
)

//object PhobosWide {
//  implicit val phobosWideDecoder: ElementDecoder[PhobosWide] = deriveElementDecoder
//}
