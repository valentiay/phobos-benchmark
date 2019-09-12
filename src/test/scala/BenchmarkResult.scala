
case class BenchmarkResult(bytes: Long, phobosTime: Double, xbTime: Double) {
  def toCsvLine: String = s"$bytes, $phobosTime, $xbTime"
}
