lazy val commonSettings = Seq(
  organization := "junzhez.leetcode",
  version := "0.1.0",
  scalaVersion := "2.11.5",
  libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
)

lazy val root = (project in file(".")).
  aggregate(util, p100, p169, p191, p83).
  settings(commonSettings: _*)

lazy val util = (project in file("util")).
  settings(commonSettings: _*)

lazy val p100 = (project in file("p100")).
  dependsOn(util).
  settings(commonSettings: _*)

lazy val p169 = (project in file("p169")).
  dependsOn(util).
  settings(commonSettings: _*)

lazy val p191 = (project in file("p191")).
  dependsOn(util).
  settings(commonSettings: _*)

lazy val p83 = (project in file("p83")).
  dependsOn(util).
  settings(commonSettings: _*)
