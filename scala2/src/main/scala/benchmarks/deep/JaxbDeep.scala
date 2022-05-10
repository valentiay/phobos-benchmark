package benchmarks.deep

import utils.jaxb._

import javax.xml.bind._
import javax.xml.bind.annotation._

@XmlRootElement(name = "Deep")
@XmlAccessorType(XmlAccessType.FIELD)
case class JaxbDeep(
    @FieldXmlAttribute foo: Int,
    bar: String,
    baz: Double,
    deep: JaxbDeep,
) {
  def this() = this(0, "", 0, null)
}

object JaxbDeep {
  val unmarshaller: Unmarshaller = {
    val context = JAXBContext.newInstance(classOf[JaxbDeep])
    context.createUnmarshaller()
  }
}
