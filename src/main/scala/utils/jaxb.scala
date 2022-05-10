package utils

import scala.annotation.meta.field
import javax.xml.bind.annotation._

object jaxb {
  type FieldXmlAttribute = XmlAttribute @field
  type FieldXmlElement   = XmlElement @field
}
