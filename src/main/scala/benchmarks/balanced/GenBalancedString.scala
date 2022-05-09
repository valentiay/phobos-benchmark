package benchmarks.balanced

import scala.util.Random

object GenBalancedString {
  def randomString(): String = Random.alphanumeric.take(Random.nextInt(50)).mkString

  def genFooString(): String = {
    val foobarElements = Random
      .shuffle(
        List(
          s"<foobarbaz>${Random.nextInt(100)}</foobarbaz>",
          s"<foobarqux>${randomString()}</foobarqux>",
          s"<foobarbat>${Random.nextDouble()}</foobarbat>",
        ),
      )
      .mkString
    val foobar = s"<foobar foobarattr=\"${randomString()}\">$foobarElements</foobar>"

    val foobazElements = Random
      .shuffle(
        List(
          s"<foobazbar>${Random.nextInt(100)}</foobazbar>",
          s"<foobazqux>${randomString()}</foobazqux>",
          s"<foobazbat>${Random.nextDouble()}</foobazbat>",
        ),
      )
      .mkString
    val foobaz = s"<foobaz foobazattr=\"${randomString()}\">$foobazElements</foobaz>"

    val fooquxElements = Random
      .shuffle(
        List(
          s"<fooquxbar>${Random.nextInt(100)}</fooquxbar>",
          s"<fooquxbaz>${randomString()}</fooquxbaz>",
          s"<fooquxbat>${Random.nextDouble()}</fooquxbat>",
        ),
      )
      .mkString
    val fooqux = s"<fooqux fooquxattr=\"${randomString()}\">$fooquxElements</fooqux>"

    s"<foo fooattr=\"${randomString()}\">${Random.shuffle(List(foobar, foobaz, fooqux)).mkString}</foo>"
  }

  def genBarString(): String = {
    val barfooElements = Random
      .shuffle(
        List(
          s"<barfoobaz>${Random.nextInt(100)}</barfoobaz>",
          s"<barfooqux>${randomString()}</barfooqux>",
          s"<barfoobat>${Random.nextDouble()}</barfoobat>",
        ),
      )
      .mkString
    val barfoo = s"<barfoo barfooattr=\"${Random.nextInt(100)}\">$barfooElements</barfoo>"

    val barbazElements = Random
      .shuffle(
        List(
          s"<barbazfoo>${Random.nextInt(100)}</barbazfoo>",
          s"<barbazqux>${randomString()}</barbazqux>",
          s"<barbazbat>${Random.nextDouble()}</barbazbat>",
        ),
      )
      .mkString
    val barbaz = s"<barbaz barbazattr=\"${Random.nextInt(100)}\">$barbazElements</barbaz>"

    val barquxElements = Random
      .shuffle(
        List(
          s"<barquxfoo>${Random.nextInt(100)}</barquxfoo>",
          s"<barquxbaz>${randomString()}</barquxbaz>",
          s"<barquxbat>${Random.nextDouble()}</barquxbat>",
        ),
      )
      .mkString
    val barqux = s"<barqux barquxattr=\"${Random.nextInt(100)}\">$barquxElements</barqux>"

    s"<bar barattr=\"${Random.nextInt()}\">${Random.shuffle(List(barfoo, barbaz, barqux)).mkString}</bar>"
  }

  def genBazString(): String = {
    val bazfooElements = Random
      .shuffle(
        List(
          s"<bazfoobar>${Random.nextInt(100)}</bazfoobar>",
          s"<bazfooqux>${randomString()}</bazfooqux>",
          s"<bazfoobat>${Random.nextDouble()}</bazfoobat>",
        ),
      )
      .mkString
    val bazfoo = s"<bazfoo bazfooattr=\"${Random.nextDouble()}\">$bazfooElements</bazfoo>"

    val bazbarElements = Random
      .shuffle(
        List(
          s"<bazbarfoo>${Random.nextInt(100)}</bazbarfoo>",
          s"<bazbarqux>${randomString()}</bazbarqux>",
          s"<bazbarbat>${Random.nextDouble()}</bazbarbat>",
        ),
      )
      .mkString
    val bazbar = s"<bazbar bazbarattr=\"${Random.nextDouble()}\">$bazbarElements</bazbar>"

    val bazquxElements = Random
      .shuffle(
        List(
          s"<bazquxfoo>${Random.nextInt(100)}</bazquxfoo>",
          s"<bazquxbar>${randomString()}</bazquxbar>",
          s"<bazquxbat>${Random.nextDouble()}</bazquxbat>",
        ),
      )
      .mkString
    val bazqux = s"<bazqux bazquxattr=\"${Random.nextDouble()}\">$bazquxElements</bazqux>"

    s"<baz bazattr=\"${Random.nextDouble()}\">${Random.shuffle(List(bazfoo, bazbar, bazqux)).mkString}</baz>"
  }

  def genBalancedItemString(): String =
    s"<BalancedItem>${Random.shuffle(List(genFooString(), genBarString(), genBazString())).mkString}</BalancedItem>"

  def genBalancedString(n: Int): String =
    s"<BalancedItems>${List.fill(n)(genBalancedItemString()).mkString}</BalancedItems>"
}
