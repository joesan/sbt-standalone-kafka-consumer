# sbt-standalone-kafka-consumer

1. git clone

2. To produce the jar file with all the dependencies, run 
   sbt assembly

3. run the jar file using the following command
   java -cp target/scala-2.11/spark-kafka-consumer-0.1.0-SNAPAHOT.jar com.eon.vpp.SimpleConsumer 10000 test_topic 1 localhost 9092
