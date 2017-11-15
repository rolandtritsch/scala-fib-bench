package org.tritsch.fibonacci

import org.scalameter.api._

object FibonacciBench extends Bench.OfflineReport {
  import Fibonacci._

  // generators
  val ns = Gen.range("n")(0, 29, 1)

  // tests
  performance of "Fibonacci" in {
    measure method "fib1" in {
      using(ns) in {
        n => fib1(n)
      }
    }
  }
}