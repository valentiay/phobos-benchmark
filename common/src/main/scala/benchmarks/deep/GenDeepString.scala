package benchmarks.deep

import scala.util.Random

object GenDeepString {

  def getDeepItemString(inner: Option[String] = None): String = {
    val innerText = inner.fold("")(i => s"<deep foo=\"${Random.nextInt(100)}\">$i</deep>")
    s"<bar>${Random.alphanumeric.take(Random.nextInt(50)).mkString}</bar>" +
      s"$innerText" +
      s"<baz>${Random.nextDouble()}</baz>"
  }

  def genDeepString(depth: Int): String = {
    val inner = LazyList.iterate[Option[String]](None, depth)(inner => Some(getDeepItemString(inner))).last
    s"<Deep foo=\"${Random.nextInt(100)}\">${inner.getOrElse("")}</Deep>"
  }
}
