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

  def fib2(n: Int): Int = {
    require(n >= 0, s"n == ${n}; n >= 0 violated")

    lazy val fibs: Stream[Int] = 0 #:: 1 #:: fibs.zip(fibs.tail).map(n => n._1 + n._2)
    fibs.take(n+1).last
  }

  def fib3(n: Int): Int = {
    require(n >= 0, s"n == ${n}; n >= 0 violated")

    def fibs(i: Int, ii: Int): Stream[Int] = i #:: fibs(ii, i + ii)
    fibs(0, 1).take(n+1).last
  }

  def fib4(n: Int): Int = {
    require(n >= 0, s"n == ${n}; n >= 0 violated")

    def fibs(i: Int): (Int, Int) = i match {
      case 1 => (1, 0)
      case _ =>
        val (a, b) = fibs(i / 2)
        val p = (2*b + a) * a
        val q = a*a + b*b
        if (i % 2 == 0) (p, q) else (p + q, p)
    }

    n match {
      case 0 => 0
      case _ => fibs(n)._1
    }
  }
}
