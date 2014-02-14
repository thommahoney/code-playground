import sbt._
import Keys._

object CodePlayground extends Build {

  val buildSettings = Defaults.defaultSettings ++ Seq(
    organization := "me.moschops",
    scalaVersion := "2.10.3",
    scalacOptions := List("-feature", "-deprecation")
  )

  val dependencies = Seq(
    "com.typesafe.akka" % "akka-agent_2.10" % "2.2.1",
    "joda-time" % "joda-time" % "2.3",
    "org.joda" % "joda-convert" % "1.5",
    "commons-codec" % "commons-codec" % "1.9",
    "commons-lang" % "commons-lang" % "2.6")
  
    lazy val root = Project(id = "CodePlayground",
                            base = file(".")).settings(libraryDependencies ++= dependencies)


}
