# flink-kafka-integration
Kafka send stream data to flink ,flink analysis data and send to Kafka.

# Start Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start Kafka Server
.\bin\windows\kafka-server-start.bat .\config\server.properties

# Create Topic
.\bin\windows\kafka-topics.bat --create --topic flink-test --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1


# Create Producer
.\bin\windows\kafka-console-producer.bat --topic flink-test --bootstrap-server localhost:9092

# Create Consumer
.\bin\windows\kafka-console-consumer.bat --topic flink-test --from-beginning --bootstrap-server localhost:9092

