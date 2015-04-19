lazy val commonSettings = Seq(
  organization := "junzhez.leetcode",
  version := "0.1.0",
  scalaVersion := "2.11.5",
  libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  scalaSource in Test <<= (baseDirectory in Test)(_ / "test")
)


lazy val util = ProjectRef(file("../util"), "util")

lazy val p83 = (project in file(".")).
  settings(commonSettings: _*).
  dependsOn(util)
