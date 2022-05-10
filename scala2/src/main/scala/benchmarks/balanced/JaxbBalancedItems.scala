package benchmarks.balanced

import utils.jaxb._

import javax.xml.bind._
import javax.xml.bind.annotation._

@XmlRootElement(name = "BalancedItems")
@XmlAccessorType(XmlAccessType.FIELD)
case class JaxbBalancedItems(
    @FieldXmlElement(name = "BalancedItem") BalancedItem: java.util.List[JaxbBalancedItems.JaxbBalanced],
) {
  def this() = this(new java.util.ArrayList())
}

object JaxbBalancedItems {
  val unmarshaller: Unmarshaller = {
    val context = JAXBContext.newInstance(classOf[JaxbBalancedItems])
    context.createUnmarshaller()
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  case class JaxbBalanced(
      foo: Foo,
      bar: Bar,
      baz: Baz,
  ) {
    def this() = this(null, null, null)
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  case class Foo(
      @FieldXmlAttribute fooattr: String,
      foobar: Foo.Bar,
      foobaz: Foo.Baz,
      fooqux: Foo.Qux,
  ) {
    def this() = this("", null, null, null)
  }

  object Foo {
    @XmlType(namespace = "foo")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Bar(@FieldXmlAttribute foobarattr: String, foobarbaz: Int, foobarqux: String, foobarbat: Double) {
      def this() = this("", 0, "", 0)
    }
    @XmlType(namespace = "foo")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Baz(@FieldXmlAttribute foobazattr: String, foobazbar: Int, foobazqux: String, foobazbat: Double) {
      def this() = this("", 0, "", 0)
    }
    @XmlType(namespace = "foo")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Qux(@FieldXmlAttribute fooquxattr: String, fooquxbar: Int, fooquxbaz: String, fooquxbat: Double) {
      def this() = this("", 0, "", 0)
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  case class Bar(
      @FieldXmlAttribute barattr: Int,
      barfoo: Bar.Foo,
      barbaz: Bar.Baz,
      barqux: Bar.Qux,
  ) {
    def this() = this(0, null, null, null)
  }

  object Bar {
    @XmlType(namespace = "bar")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Foo(@FieldXmlAttribute barfooattr: Int, barfoobaz: Int, barfooqux: String, barfoobat: Double) {
      def this() = this(0, 0, "", 0)
    }
    @XmlType(namespace = "bar")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Baz(@FieldXmlAttribute barbazattr: Int, barbazfoo: Int, barbazqux: String, barbazbat: Double) {
      def this() = this(0, 0, "", 0)
    }
    @XmlType(namespace = "bar")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Qux(@FieldXmlAttribute barquxattr: Int, barquxfoo: Int, barquxbaz: String, barquxbat: Double) {
      def this() = this(0, 0, "", 0)
    }
  }

  @XmlAccessorType(XmlAccessType.FIELD)
  case class Baz(
      @FieldXmlAttribute bazattr: Double,
      bazfoo: Baz.Foo,
      bazbar: Baz.Bar,
      bazqux: Baz.Qux,
  ) {
    def this() = this(0, null, null, null)
  }

  object Baz {
    @XmlType(namespace = "baz")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Foo(@FieldXmlAttribute bazfooattr: Double, bazfoobar: Int, bazfooqux: String, bazfoobat: Double) {
      def this() = this(0, 0, "", 0)
    }
    @XmlType(namespace = "baz")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Bar(@FieldXmlAttribute bazbarattr: Double, bazbarfoo: Int, bazbarqux: String, bazbarbat: Double) {
      def this() = this(0, 0, "", 0)
    }
    @XmlType(namespace = "baz")
    @XmlAccessorType(XmlAccessType.FIELD)
    case class Qux(@FieldXmlAttribute bazquxattr: Double, bazquxfoo: Int, bazquxbar: String, bazquxbat: Double) {
      def this() = this(0, 0, "", 0)
    }
  }
}
