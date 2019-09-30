ThisBuild / name := "phobos-benchmark"

ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.1"

lazy val scalaXml    = "org.scala-lang.modules" %% "scala-xml"                % "1.2.0"
lazy val scalaParser = "org.scala-lang.modules" %% "scala-parser-combinators" % "1.1.2"
lazy val phobos      = "ru.tinkoff"             %% "phobos-core"              % "0.1.1-2.13-SNAPSHOT"

lazy val root =
  (project in file("."))
    .enablePlugins(ScalaxbPlugin)
    .enablePlugins(JmhPlugin)
    .settings(
      libraryDependencies ++= List(scalaXml, scalaParser, phobos),
      parallelExecution in Test := false,
      logBuffered := false,
      scalaxbPackageName in (Compile, scalaxb) := "xb",
      scalacOptions ++= List("-Ymacro-annotations")
    )
