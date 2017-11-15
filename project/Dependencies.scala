import sbt._

object Dependencies {
  lazy val scalactic = "org.scalactic" %% "scalactic" % "3.0.4"
  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.4"
  lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.13.4"
  lazy val scalameter = "com.storm-enroute" % "scalameter_2.12" % "0.8.2"
}
