import sbt._
import Keys._

object VPPMetricsProjectBuild extends Build {

  import Dependencies._
  import BuildSettings._

  // Configure prompt to show current project
  override lazy val settings = super.settings :+ {
    shellPrompt := { s => Project.extract(s).currentProject.id + " > " }
  }

  // Define our project, with basic project information and library dependencies
  lazy val project = Project("spark-kafka-consumer", file("."))
    .settings(buildSettings: _*)
    .settings(
      libraryDependencies ++= Seq(
        Libraries.sparkCore,
        Libraries.sparkStreamingKafka,
        Libraries.sparkStreaming,
        Libraries.sparkCassandra,
        Libraries.log4j,
        Libraries.kafka,
        Libraries.jodaTime,
        Libraries.sprayJson
        // Add your additional libraries here (comma-separated)...
      )
    )
}