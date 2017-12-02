lazy val commonSettings = Seq(
  organization := "ru.job4j",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.12.1"
)

libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"

lazy val chapter_001 = (project in file("chapter_001")).
  settings(commonSettings: _*)
  .settings(
    libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
  ).settings(
    name := "chapter_001",
    moduleName := "chapter_001"
  )

lazy val root = (project in file("."))
  .aggregate(chapter_001)
  .settings(commonSettings: _*)
