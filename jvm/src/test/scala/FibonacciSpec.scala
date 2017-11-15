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

  "fib2" should "throw an exception, if n is < 0" in {
    a [IllegalArgumentException] should be thrownBy {
      fib2(-1)
    }
  }

  it should "return the right values" in {
    fib2(0) should be (0)
    fib2(1) should be (1)
    fib2(10) should be (55)
  }

  "fib3" should "throw an exception, if n is < 0" in {
    a [IllegalArgumentException] should be thrownBy {
      fib3(-1)
    }
  }

  it should "return the right values" in {
    fib3(0) should be (0)
    fib3(1) should be (1)
    fib3(10) should be (55)
  }

  "fib4" should "throw an exception, if n is < 0" in {
    a [IllegalArgumentException] should be thrownBy {
      fib4(-1)
    }
  }

  it should "return the right values" in {
    fib4(0) should be (0)
    fib4(1) should be (1)
    fib4(10) should be (55)
  }
}