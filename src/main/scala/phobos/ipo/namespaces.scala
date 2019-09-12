package phobos.ipo

import ru.tinkoff.phobos.Namespace

object namespaces {
  case object ipo1
  implicit val ipo1Namespace: Namespace[ipo1.type] = Namespace.mkInstance("http://www.example.com/IPO")
}