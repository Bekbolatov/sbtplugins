sbtPlugin := true
initialCommands in console := "import com.sparkydots.sbt._"

scalaVersion := "2.10.4"

organization := "com.sparkydots.sbt"
name := "wordFilter"
version := "0.0.2-SNAPSHOT"

publishMavenStyle := false
publishArtifact in (Compile, packageDoc) := false
publishArtifact in (Compile, packageSrc) := false





