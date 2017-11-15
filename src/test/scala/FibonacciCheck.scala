package org.tritsch.fibonacci

import org.scalatest._
import org.scalatest.prop._
import org.scalacheck.Gen

class FibonacciCheck extends PropSpec with GeneratorDrivenPropertyChecks with Matchers {
  import Fibonacci._

  implicit override val generatorDrivenConfig = PropertyCheckConfig(minSuccessful = 10)

  val ns = for(n <- Gen.choose(2, 10)) yield n

  property("for all n >= 2, fib(n) == fib(n-1) + fib(n-2)") {
    forAll(ns) {n =>
      fib1(n) should be (fib1(n - 1) + fib1(n - 2))
      fib2(n) should be (fib1(n - 1) + fib1(n - 2))
      fib3(n) should be (fib1(n - 1) + fib1(n - 2))
      fib4(n) should be (fib1(n - 1) + fib1(n - 2))
    }
  }
}