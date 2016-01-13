package com.test.api.consumer
/*
import scala.util.Random
import java.util.Properties

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.storage.StorageLevel
import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.StreamingContext._
import org.apache.spark.streaming.kafka.KafkaUtils
import org.apache.spark.rdd.RDD

import kafka.producer.KeyedMessage
import kafka.producer.Producer
import kafka.producer.ProducerConfig
import kafka.serializer.StringDecoder

import spray.json._
import DefaultJsonProtocol._

import com.datastax.spark.connector._
import com.datastax.spark.connector.streaming._
import com.datastax.spark.connector.cql.CassandraConnector */

import org.apache.log4j.Logger
import org.apache.log4j.LogManager

case class TsDataPoint(
  metric: String,
  timestamp: Long,
  value: Double,
  tags: Map[String, String]
)

object MetricsConsumer {
/*
  implicit val tsDataPointJsonFmt = jsonFormat4(TsDataPoint)

  def main(args: Array[String]) {
    val log:Logger = LogManager.getLogger("Streaming Kafka Consumer - Spark-Fu!")

    val sc = new SparkConf(true)
      .set("spark.cassandra.connection.host", "127.0.0.1")
      .setAppName("VPPMetricsConsumer")
      .setMaster("spark://127.0.0.1:7077")

    val ssc: StreamingContext = new StreamingContext(sc, Seconds(3))
  
    val kafkaParams = Map(
      "zookeeper.connect" -> "localhost:2181",
      "zookeeper.connection.timeout.ms" -> "6000",
      "group.id" -> "sparkfu"
    )

    val topics = Map(
      "vpp-metrics" -> 1
    )

    // What the fuck this should mean?
    val storageLevel = StorageLevel.MEMORY_ONLY

    val messages = KafkaUtils.createStream[String, String, StringDecoder, StringDecoder](ssc, kafkaParams, topics, storageLevel)
      messages.foreachRDD { rdd =>

        println("printing the rdd ontained from kafka!!!!!1")    
        println(rdd)

        //val message: RDD[(String, String)] = rdd.map { y => (randomString(25), y._2) }
        //message.saveToCassandra("vppmetrics", "messages", SomeColumns("key","msg"))
    }

    // Listen for SIGTERM and shutdown gracefully.
    sys.ShutdownHookThread {
      log.info("Gracefully stopping Spark Streaming Application")
      //ssc.stop(stopSparkContext = true, stopGracefully = true)
      ssc.stop(true, true)
      log.info("Application stopped")
    } 
   
    ssc.start()             // Start the computation
    ssc.awaitTermination()  // Wait for the computation to terminate (manually or due to any error)
  } */
}