package org.tritsch.fibonacci

object Bench {
  import Fibonacci._

  def main(args: Array[String]): Unit = {
    val start1 = System.currentTimeMillis
    print(s"fib1(30) -> ${fib1(30)}")
    println(s" - ${System.currentTimeMillis - start1} ms")

    val n = 30000

    val start2 = System.currentTimeMillis
    print(s"fib2(${n}) -> ${fib2(n)}")
    println(s" - ${System.currentTimeMillis - start2} ms")

    val start3 = System.currentTimeMillis
    print(s"fib3(${n}) -> ${fib3(n)}")
    println(s" - ${System.currentTimeMillis - start3} ms")

    val start4 = System.currentTimeMillis
    print(s"fib4(${n}) -> ${fib4(n)}")
    println(s" - ${System.currentTimeMillis - start4} ms")
  }
}
