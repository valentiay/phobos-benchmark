package benchmarks.wide

import scala.util.Random

object GenWideString {
  val attributes =
    Map(
      "foobarqux" -> "Short",
      "fooquxbar" -> "Int",
      "barfooqux" -> "Long",
      "barquxfoo" -> "Boolean",
      "quxfoobar" -> "String",
      "quxbarfoo" -> "String",
      "foobarbaz" -> "Short",
      "foobazbar" -> "Int",
      "barfoobaz" -> "Long",
      "barbazfoo" -> "Boolean",
    )

  val elements =
    Map(
      "bazfoobar" -> "String",
      "bazbarfoo" -> "String",
      "foobarbat" -> "Short",
      "foobatbar" -> "Int",
      "barfoobat" -> "Long",
      "barbatfoo" -> "String",
      "batfoobar" -> "Boolean",
      "batbarfoo" -> "String",
      "fooquxbaz" -> "Short",
      "foobazqux" -> "Int",
      "quxfoobaz" -> "Long",
      "quxbazfoo" -> "String",
      "bazfooqux" -> "String",
      "bazquxfoo" -> "Boolean",
      "fooquxbat" -> "Short",
      "foobatqux" -> "Int",
      "quxfoobat" -> "Long",
      "quxbatfoo" -> "String",
      "batfooqux" -> "Boolean",
      "batquxfoo" -> "String",
      "foobazbat" -> "Short",
      "foobatbaz" -> "Int",
      "bazfoobat" -> "Long",
      "bazbatfoo" -> "String",
      "batfoobaz" -> "String",
      "batbazfoo" -> "Boolean",
      "barquxbaz" -> "Short",
      "barbazqux" -> "Int",
      "quxbarbaz" -> "Boolean",
      "quxbazbar" -> "Long",
      "bazbarqux" -> "String",
      "bazquxbar" -> "String",
      "barquxbat" -> "Short",
      "barbatqux" -> "Int",
      "quxbarbat" -> "Boolean",
      "quxbatbar" -> "Long",
      "batbarqux" -> "String",
      "batquxbar" -> "String",
      "barbazbat" -> "Short",
      "barbatbaz" -> "Int",
      "bazbarbat" -> "Boolean",
      "bazbatbar" -> "String",
      "batbarbaz" -> "Long",
      "batbazbar" -> "String",
      "quxbazbat" -> "Short",
      "quxbatbaz" -> "Int",
      "bazquxbat" -> "Boolean",
      "bazbatqux" -> "String",
      "batquxbaz" -> "String",
      "batbazqux" -> "Long",
    )

  def genValueByType(typ: String): String =
    typ match {
      case "Boolean" => Random.nextBoolean().toString
      case "String"  => Random.alphanumeric.take(Random.nextInt(50)).mkString
      case _         => Random.nextInt(1000).toString
    }

  def genWideItemString(): String = {
    val attributesString =
      Random.shuffle(attributes.map { case (name, typ) => s"$name=\"${genValueByType(typ)}\"" }).mkString(" ")
    val elementsString =
      Random.shuffle(elements.map { case (name, typ) => s"<$name>${genValueByType(typ)}</$name>" }).mkString
    s"<WideItem $attributesString>$elementsString</WideItem>"
  }

  def genWideString(n: Int): String =
    s"<WideItems>${List.fill(n)(genWideItemString()).mkString}</WideItems>"
}
