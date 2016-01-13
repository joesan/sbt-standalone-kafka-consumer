import sbt._

object Dependencies {
  val resolutionRepos = Seq(
    "Spray Repository" at "http://repo.spray.cc/"
  )

  // versions for all the used libraries
   object Versions {
    val sparkCore           = "1.6.0"
    val sparkStreamingKafka = "1.6.0"
    val sparkStreaming      = "1.6.0"
    val sparkCassandra      = "1.4.1"
    val kafka               = "0.8.0"
    val jodaTime            = "2.7"
    val sprayJson           = "1.3.2"
    val log4j               = "1.2.14"
  }

  object Libraries {
    val sparkCore            = "org.apache.spark"   %% "spark-core"                % Versions.sparkCore 
    val sparkStreamingKafka  = "org.apache.spark"   %% "spark-streaming-kafka"     % Versions.sparkStreamingKafka
    val sparkStreaming       = "org.apache.spark"   %% "spark-streaming"           % Versions.sparkStreaming 
    val kafka                = "org.apache.kafka"   %% "kafka"                     % Versions.kafka
    val jodaTime             = "joda-time"          %  "joda-time"                 % Versions.jodaTime
    val sparkCassandra       = "com.datastax.spark" %% "spark-cassandra-connector" % Versions.sparkCassandra
    val sprayJson            = "io.spray"           %% "spray-json"                % Versions.sprayJson
    val log4j                = "log4j"              %  "log4j"                     % Versions.log4j
  }
}
