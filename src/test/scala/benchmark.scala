import ru.tinkoff.phobos.decoding.XmlDecoder
import scalaxb.XMLFormat

import scala.xml.XML

object benchmark {
  def measure[A](test: => A): Double = {
    val start = System.nanoTime()
    test
    val end = System.nanoTime()
    (end - start) / 1000000.0
  }

  def testSingleDecoding[PH: XmlDecoder, XB: XMLFormat](string: String): BenchmarkResult = {
    val xbTime     = measure(scalaxb.fromXML[XB](XML.loadString(string)))
    val phobosTime = measure(XmlDecoder[PH].decode(string))
    BenchmarkResult(string.getBytes.length, phobosTime, xbTime)
  }

  def testDecoding[PH: XmlDecoder, XB: XMLFormat](testName: String,
                                                  args: Array[String],
                                                  genString: Int => String): Unit = {
    val (lower, upper, step) = args match {
      case Array(f, t, s) => (f.toInt, t.toInt, s.toInt)
      case Array()        => (0, 10000, 50)
      case _ =>
        throw new IllegalArgumentException("Pass three integers: lower bound, upper bound and step")
    }

    // warmup
    benchmark.testSingleDecoding[PH, XB](genString(1))

    val results = for (n <- lower to upper by step) yield {
      if (10 * (n - step) / (upper - lower) < 10 * n / (upper - lower)) {
        println(s"$testName: ${100 * n / (upper - lower)}% ready")
      }
      benchmark.testSingleDecoding[PH, XB](genString(n))
    }
    utils.dumpTestResults(testName, results)
  }

}
