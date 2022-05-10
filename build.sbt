ThisBuild / name := "phobos-benchmark"

ThisBuild / version := "0.1"

ThisBuild / scalaVersion := "2.13.8"

lazy val scalaXml       = "org.scala-lang.modules" %% "scala-xml"                % "2.1.0"
lazy val scalaParser    = "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
lazy val phobos         = "ru.tinkoff"             %% "phobos-core"              % "0.15.0"
lazy val jaxb           = "javax.xml.bind"          % "jaxb-api"                 % "2.3.1"
lazy val jaxbactivation = "javax.activation"        % "activation"               % "1.1.1"
lazy val jaxbruntime    = "org.glassfish.jaxb"      % "jaxb-runtime"             % "2.3.1"

lazy val root =
  (project in file("."))
    .enablePlugins(ScalaxbPlugin)
    .enablePlugins(JmhPlugin)
    .settings(
      libraryDependencies ++= List(scalaXml, scalaParser, phobos, jaxb, jaxbactivation, jaxbruntime),
      Test / parallelExecution := false,
      logBuffered              := false,
      fork                     := true,
      javaOptions += "-Xmx4G",
      Compile / scalaxb / scalaxbPackageName := "xb",
      scalacOptions ++= List("-Ymacro-annotations"),
    )
