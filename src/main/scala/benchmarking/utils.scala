package benchmarking

import scala.util.Random

object utils {
  private val alphanumeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"

  def randomString(length: Int): String =
    List.fill(Random.nextInt(length))(alphanumeric.charAt(Random.nextInt(alphanumeric.length))).mkString

}
