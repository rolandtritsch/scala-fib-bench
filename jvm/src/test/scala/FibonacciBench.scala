package org.tritsch.fibonacci

import org.scalameter.api._

object FibonacciBench extends Bench.OfflineReport {
  import Fibonacci._

  // generators
  val ns = Gen.range("n")(0, 30, 3)
  val nns = Gen.range("n")(0, 30000, 3000)

  // tests
  performance of "Fibonacci" in {
    measure method "fib1" in {
      using(ns) in {
        n => fib1(n)
      }
    }

    measure method "fib2" in {
      using(nns) in {
        n => fib2(n)
      }
    }

    measure method "fib3" in {
      using(nns) in {
        n => fib3(n)
      }
    }

    measure method "fib4" in {
      using(nns) in {
        n => fib4(n)
      }
    }
  }
}