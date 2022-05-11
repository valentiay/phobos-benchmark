import sbt.Compile

ThisBuild / version := "0.2"

ThisBuild / scalaVersion := "2.13.8"

lazy val scalaXml       = "org.scala-lang.modules" %% "scala-xml"                % "2.1.0"
lazy val scalaParser    = "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1"
lazy val phobos         = "ru.tinkoff"             %% "phobos-core"              % "0.15.0"
lazy val jaxb           = "javax.xml.bind"          % "jaxb-api"                 % "2.3.1"
lazy val jaxbactivation = "javax.activation"        % "activation"               % "1.1.1"
lazy val jaxbruntime    = "org.glassfish.jaxb"      % "jaxb-runtime"             % "2.3.1"

Test / parallelExecution := false
logBuffered              := false
fork                     := true

javaOptions += "-Xmx4G"

val scala2Version = "2.13.8"
val scala3Version = "3.1.2"

lazy val common =
  (projectMatrix in file(s"common"))
    .jvmPlatform(List(scala2Version, scala3Version))

lazy val scala2 =
  (projectMatrix in file(s"scala2"))
    .settings(
      libraryDependencies ++= List(scalaXml, scalaParser, phobos, jaxb, jaxbactivation, jaxbruntime),
      Compile / scalaxb / scalaxbPackageName := "xb",
    )
    .enablePlugins(ScalaxbPlugin)
    .enablePlugins(JmhPlugin)
    .dependsOn(common)
    .jvmPlatform(List(scala2Version))

lazy val scala3 =
  (projectMatrix in file(s"scala3"))
    .settings(
      libraryDependencies ++= List(phobos),
    )
    .enablePlugins(JmhPlugin)
    .dependsOn(common)
    .jvmPlatform(List(scala3Version))

addCommandAlias(
  "benchmark",
  ";scala33 / Jmh / run -rf csv -prof gc -rff ../../../results/scala3.csv" +
    ";scala2 / Jmh / run -rf csv -prof gc -rff ../../../results/scala2.csv",
)
