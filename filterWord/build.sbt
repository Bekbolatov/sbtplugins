sbtPlugin := true
initialCommands in console := "import io.maana.renat.sbt._"

scalaVersion := "2.10.4"

organization := "io.maana.renat.sbt"
name := "wordFilter"
version := "0.0.2-SNAPSHOT"

publishMavenStyle := false
publishArtifact in (Compile, packageDoc) := false
publishArtifact in (Compile, packageSrc) := false





