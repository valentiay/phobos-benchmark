import benchmarks.balanced.data._
import benchmarks.wide.data._
import benchmarks.deep.data._

object PrintSizes extends App {
  println("Balanced")
  println(balanced121393.length / 121393)
  println("Wide")
  println(wide121393.length / 121393)
  println("Deep")
  println(deep500.length / 500)
}
