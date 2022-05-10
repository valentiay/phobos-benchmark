package benchmarks.wide

import ru.tinkoff.phobos.decoding.ElementDecoder
import ru.tinkoff.phobos.decoding.XmlDecoder
import ru.tinkoff.phobos.derivation.semiauto.deriveElementDecoder
import ru.tinkoff.phobos.derivation.semiauto.deriveXmlDecoder
import ru.tinkoff.phobos.syntax.attr

case class PhobosWideItems(
    WideItem: List[PhobosWide],
)

object PhobosWideItems {
  implicit val phobosWideItemsDecoder: XmlDecoder[PhobosWideItems] = deriveXmlDecoder("WideItems")
}

case class PhobosWide(
    @attr foobarqux: Short,
    @attr fooquxbar: Int,
    @attr barfooqux: Long,
    @attr barquxfoo: Boolean,
    @attr quxfoobar: String,
    @attr quxbarfoo: String,
    @attr foobarbaz: Short,
    @attr foobazbar: Int,
    @attr barfoobaz: Long,
    @attr barbazfoo: Boolean,
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

object PhobosWide {
  implicit val phobosWideDecoder: ElementDecoder[PhobosWide] = deriveElementDecoder
}
