package org.tritsch.fibonacci

object Fibonacci {
  def fib1(n: Int): Int = {
    require(n >= 0, s"n == ${n}; n >= 0 violated")
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fib1(n - 1) + fib1(n - 2)
    }
  }

  def main(args: Array[String]): Unit = {
    require(args.length == 0, "Usage: Fibonacci")
  }
}
