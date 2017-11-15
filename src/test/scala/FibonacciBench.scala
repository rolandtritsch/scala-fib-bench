package org.tritsch.fibonacci

import org.scalameter.api._
import org.scalameter.picklers.Implicits._

object FibonacciBench extends Bench[Double] {
  import Fibonacci._

  // configuration
  private lazy val defaultRuns = 5

  lazy val executor = SeparateJvmsExecutor(
    new Executor.Warmer.Default,
    Aggregator.average,
    measurer
  )
  lazy val measurer = new Measurer.Default
  lazy val reporter = new HtmlReporter[Double](true)
  lazy val persistor = Persistor.None

  // generators

  val ns = Gen.range("n")(0, 29, 1)

  // tests

  performance of "Fibonacci" in {
    measure method "fib1" config(
      exec.minWarmupRuns -> defaultRuns,
      exec.maxWarmupRuns -> defaultRuns,
      exec.benchRuns -> defaultRuns
    ) in {
      using(ns) in {
        n => fib1(n)
      }
    }
  }
}