ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.0.2"

lazy val root = (project in file("."))
  .settings(
    name := "Question1"
  )
lazy val file2 = (project in file("project_B"))

lazy val file1 = (project in file("project_A")).dependsOn(file2)
