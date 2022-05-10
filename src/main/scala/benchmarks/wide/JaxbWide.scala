package benchmarks.wide

import javax.xml.bind.annotation._
import utils.jaxb._

import javax.xml.bind._

@XmlRootElement(name = "WideItems")
@XmlAccessorType(XmlAccessType.FIELD)
case class JaxbWideItems(
    @FieldXmlElement(name = "WideItem")
    WideItem: java.util.List[JaxbWide],
) {
  def this() = this(new java.util.ArrayList())
}

object JaxbWideItems {
  val unmarshaller: Unmarshaller = {
    val context = JAXBContext.newInstance(classOf[JaxbWideItems])
    context.createUnmarshaller()
  }
}

@XmlAccessorType(XmlAccessType.FIELD)
case class JaxbWide(
    @FieldXmlAttribute foobarqux: Short,
    @FieldXmlAttribute fooquxbar: Int,
    @FieldXmlAttribute barfooqux: Long,
    @FieldXmlAttribute barquxfoo: Boolean,
    @FieldXmlAttribute quxfoobar: String,
    @FieldXmlAttribute quxbarfoo: String,
    @FieldXmlAttribute foobarbaz: Short,
    @FieldXmlAttribute foobazbar: Int,
    @FieldXmlAttribute barfoobaz: Long,
    @FieldXmlAttribute barbazfoo: Boolean,
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
) {
  // format: off
  def this() = this(
    0, 0, 0, false, "", "", 0, 0, 0, false, "", "", 0, 0, 0, "", false, "", 0, 0, 0, "", "", false, 0, 0, 0, "", false,
    "", 0, 0, 0, "", "", false, 0, 0, false, 0, "", "", 0, 0, false, 0, "", "", 0, 0, false, "", 0, "", 0, 0, false, "",
    "", 0,
  )
  // format: on
}
