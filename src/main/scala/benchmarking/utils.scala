package benchmarking

import java.nio.file.{Files, Paths}

import scala.util.Random

object utils {
  private val alphanumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

  def randomString(length: Int): String =
    List.fill(Random.nextInt(length))(alphanumeric.charAt(Random.nextInt(alphanumeric.length))).mkString

//  def dumpTestResults(testName: String, results: IndexedSeq[BenchmarkResult]): Unit = {
//    val bytes      = results.map(_.toCsvLine).mkString("size, phobosTime, xbTime\n", "\n", "\n").getBytes()
//    val resultsDir = Paths.get("./results")
//    if (!Files.exists(resultsDir)) Files.createDirectory(resultsDir)
//    Files.write(Paths.get(s"./results/$testName.csv"), bytes)
//  }

}
