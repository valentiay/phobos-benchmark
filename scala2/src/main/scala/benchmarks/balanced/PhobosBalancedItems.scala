package benchmarks.balanced

import ru.tinkoff.phobos.decoding.ElementDecoder
import ru.tinkoff.phobos.decoding.XmlDecoder
import ru.tinkoff.phobos.derivation.semiauto.deriveElementDecoder
import ru.tinkoff.phobos.derivation.semiauto.deriveXmlDecoder
import ru.tinkoff.phobos.syntax.attr

case class PhobosBalancedItems(BalancedItem: List[PhobosBalancedItems.PhobosBalanced])

object PhobosBalancedItems {
  implicit val phobosBalancedDecoder: XmlDecoder[PhobosBalancedItems] = deriveXmlDecoder("BalancedItems")

  case class PhobosBalanced(
      foo: Foo,
      bar: Bar,
      baz: Baz,
  )

  object PhobosBalanced {
    implicit val phobosBalancedDecoder: ElementDecoder[PhobosBalanced] = deriveElementDecoder
  }

  case class Foo(
      @attr fooattr: String,
      foobar: Foo.Bar,
      foobaz: Foo.Baz,
      fooqux: Foo.Qux,
  )

  object Foo {
    case class Bar(@attr foobarattr: String, foobarbaz: Int, foobarqux: String, foobarbat: Double)
    case class Baz(@attr foobazattr: String, foobazbar: Int, foobazqux: String, foobazbat: Double)
    case class Qux(@attr fooquxattr: String, fooquxbar: Int, fooquxbaz: String, fooquxbat: Double)

    implicit val fooBarDecoder: ElementDecoder[Bar] = deriveElementDecoder
    implicit val fooBazDecoder: ElementDecoder[Baz] = deriveElementDecoder
    implicit val fooQuxDecoder: ElementDecoder[Qux] = deriveElementDecoder
    implicit val fooDecoder: ElementDecoder[Foo]    = deriveElementDecoder
  }

  case class Bar(
      @attr barattr: Int,
      barfoo: Bar.Foo,
      barbaz: Bar.Baz,
      barqux: Bar.Qux,
  )

  object Bar {
    case class Foo(@attr barfooattr: Int, barfoobaz: Int, barfooqux: String, barfoobat: Double)
    case class Baz(@attr barbazattr: Int, barbazfoo: Int, barbazqux: String, barbazbat: Double)
    case class Qux(@attr barquxattr: Int, barquxfoo: Int, barquxbaz: String, barquxbat: Double)

    implicit val barFooDecoder: ElementDecoder[Foo] = deriveElementDecoder
    implicit val barBazDecoder: ElementDecoder[Baz] = deriveElementDecoder
    implicit val barQuxDecoder: ElementDecoder[Qux] = deriveElementDecoder
    implicit val barDecoder: ElementDecoder[Bar]    = deriveElementDecoder
  }

  case class Baz(
      @attr bazattr: Double,
      bazfoo: Baz.Foo,
      bazbar: Baz.Bar,
      bazqux: Baz.Qux,
  )

  object Baz {
    case class Foo(@attr bazfooattr: Double, bazfoobar: Int, bazfooqux: String, bazfoobat: Double)
    case class Bar(@attr bazbarattr: Double, bazbarfoo: Int, bazbarqux: String, bazbarbat: Double)
    case class Qux(@attr bazquxattr: Double, bazquxfoo: Int, bazquxbar: String, bazquxbat: Double)

    implicit val bazFooDecoder: ElementDecoder[Foo] = deriveElementDecoder
    implicit val bazBarDecoder: ElementDecoder[Bar] = deriveElementDecoder
    implicit val bazQuxDecoder: ElementDecoder[Qux] = deriveElementDecoder
    implicit val bazDecoder: ElementDecoder[Baz]    = deriveElementDecoder
  }
}
