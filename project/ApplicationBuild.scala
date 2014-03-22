import sbt._
import Keys._

object ApplicationBuild extends Build {

  lazy val defaultSettings = Defaults.defaultSettings ++ Seq(
    version := "1.0",
    scalaVersion := "2.10.4",
    // scalac -help
    // scalac -X
    scalacOptions := Seq(
      "-deprecation",
      "-encoding", "UTF8",
      "–explaintypes",
      "-feature",
      "–optimise",
      "-unchecked",
      "–Xcheck-null",
      "–Xcheckinit",
      "–Xlog-implicits",
      "–Xlint"
    ),
    organization := "me.moschops"
  )

  val dependencies = Seq(
    "commons-lang" % "commons-lang" % "2.6",
    "joda-time" % "joda-time" % "2.3",
    "org.joda" % "joda-convert" % "1.6",
    "commons-codec" % "commons-codec" % "1.9"
  )
  
  lazy val root = Project(id = "CodePlayground",
    base = file(".")).settings(libraryDependencies ++= dependencies)
}
