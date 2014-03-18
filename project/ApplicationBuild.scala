import sbt._
import Keys._

object ApplicationBuild extends Build {

  lazy val defaultSettings = Defaults.defaultSettings ++ Seq(
    version := "1.0",
    scalaVersion := "2.10.3",
    scalacOptions := Seq(
      "-feature",
      "-language:implicitConversions",
      "-language:postfixOps",
      "-unchecked",
      "-deprecation",
      "-encoding", "utf8",
      "-Ywarn-adapted-args"
    ),
    organization := "me.moschops"
  )

  val dependencies = Seq(
    "net.databinder.dispatch" %% "dispatch-core" % "0.9.4",
    "net.liftweb" %% "lift-json" % "2.5.1",
    "joda-time" % "joda-time" % "2.0",
    "org.joda" % "joda-convert" % "1.2",
    "com.gu" %% "fastly-api-client" % "0.1.3",
    "commons-io" % "commons-io" % "2.1",
    "commons-lang" % "commons-lang" % "2.5",
    "commons-codec" % "commons-codec" % "1.9",
    "org.scalatest" %% "scalatest" % "1.9.1" % "test"
  )
  
  lazy val root = Project(id = "CodePlayground",
    base = file(".")).settings(libraryDependencies ++= dependencies)
}
