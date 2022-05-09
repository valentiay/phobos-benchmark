package benchmarks.deep

import ru.tinkoff.phobos.decoding.ElementDecoder
import ru.tinkoff.phobos.decoding.XmlDecoder
import ru.tinkoff.phobos.derivation.semiauto.deriveElementDecoder
import ru.tinkoff.phobos.syntax.attr

case class PhobosDeep(@attr foo: Int, bar: String, baz: Double, deep: Option[PhobosDeep])
object PhobosDeep {
  implicit val phobosDeepDecoder: ElementDecoder[PhobosDeep] = deriveElementDecoder
  implicit val phobosDeepXmlDecoder: XmlDecoder[PhobosDeep]  = XmlDecoder.fromElementDecoder("Deep")
}
