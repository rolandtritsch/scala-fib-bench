package org.tritsch.fibonacci

import org.scalatest.{FlatSpec, Matchers}

class FibonacciSpec extends FlatSpec with Matchers {
  import Fibonacci._

  "fib1" should "throw an exception, if n is < 0" in {
    a [IllegalArgumentException] should be thrownBy {
      fib1(-1)
    }
  }

  it should "return the right values" in {
    fib1(0) should be (0)
    fib1(1) should be (1)
    fib1(10) should be (55)
  }
}