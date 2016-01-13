package com.test.api.consumer

//remove if not needed
import scala.collection.JavaConversions._

object SimpleVPPMetricsConsumer extends App {

  override def main(args: Array[String]) {
    val consumer = new SimpleExample()

    // maximum number of messages to read
    val maxReads = args(0).toInt

    // the topic to read from
    val topic = args(1)

    // the partition to read from
    val partition = args(2).toInt

    // broker to use for the metadata look up
    val seeds = Seq(args(3))

    // the port on which the brokers listen   
    val port = args(4).toInt

    try {
      println(s"calling consumer run ${args(0)} ${args(1)} ${args(2)} ${args(3)} ${args(4)}")
      consumer.run(maxReads, topic, partition, seeds, port)
    } catch {
      case e: Exception => {
        println("Oops:" + e)
        e.printStackTrace()
      }
    }
  }
}