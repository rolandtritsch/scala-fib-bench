import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "org.tritsch",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Fib-Bench",
    libraryDependencies += scalatest % Test,
    libraryDependencies += scalactic
  )
