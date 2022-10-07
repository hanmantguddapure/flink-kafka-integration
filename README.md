# flink-kafka-integration
Kafka send stream data to flink ,flink analysis data and send to Kafka.

# Start Zookeeper
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

# Start Kafka Server
.\bin\windows\kafka-server-start.bat .\config\server.properties

# Create Topic
.\bin\kafka-topics.sh --create --zookeeper localhost:9092 --replication-factor 1 --partitions 1 --topic flink-test
