val scala3Version = "3.2.0"

javacOptions ++= Seq("-source", "17", "-target", "17", "-Xlint")

lazy val root = project
  .in(file("."))
  .settings(
    name := "aws-lambda-scala-exercise",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    retrieveManaged := true,
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-core" % "1.2.2",
    libraryDependencies += "com.amazonaws" % "aws-lambda-java-events" % "3.11.2"
  )

ThisBuild / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x                             => MergeStrategy.first
}
