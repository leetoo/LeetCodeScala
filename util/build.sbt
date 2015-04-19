lazy val commonSettings = Seq(
  organization := "junzhez.leetcode",
  version := "0.1.0",
  scalaVersion := "2.11.5",
  libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

lazy val util = (project in file(".")).
  settings(commonSettings: _*)
