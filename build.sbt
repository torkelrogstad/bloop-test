ThisBuild / scalaVersion := "2.13.0"

lazy val A = project.in(file("a"))

lazy val B = project.in(file("b")).dependsOn(A % "compile->compile;test->test")
