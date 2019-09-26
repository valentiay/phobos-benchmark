name := "phobos-benchmark"

version := "0.1"

scalaVersion := "2.12.8"

lazy val scalaXml = "org.scala-lang.modules" %% "scala-xml" % "1.2.0"
lazy val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
lazy val phobos = "ru.tinkoff" %% "phobos" % "0.1.0"

lazy val root = (project in file(".")).
  enablePlugins(ScalaxbPlugin).
  enablePlugins(JmhPlugin).
  settings(inThisBuild(List(
    organization := "com.example",
    scalaVersion := "2.11.8",
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
  ))).
  settings(
    libraryDependencies ++= Seq(scalaXml, scalaParser, phobos),
    testFrameworks += new TestFramework("org.scalameter.ScalaMeterFramework"),
    parallelExecution in Test := false,
   logBuffered := false
  ).
  settings(scalaxbPackageName in(Compile, scalaxb) := "xb")