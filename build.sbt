import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.tritsch",
      scalaVersion := "2.12.4"
    )),
    name := "Fib-Bench",

    libraryDependencies += scalactic,
    libraryDependencies += scalatest % Test,
    libraryDependencies += scalacheck % Test,
    libraryDependencies += scalameter % Test,

    testFrameworks += new TestFramework(
      "org.scalameter.ScalaMeterFramework"
    ),
    parallelExecution in Test := false,
    logBuffered := false
  )
