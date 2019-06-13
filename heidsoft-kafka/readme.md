
# topic

```create topic```

bin/kafka-topics.sh --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic test 

```list topic```

bin/kafka-topics.sh --list --bootstrap-server localhost:9092

```producer topic```

bin/kafka-console-producer.sh --broker-list localhost:9092 --topic test

```consumer topic```

bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test --from-beginning


```describe topic```

bin/kafka-topics.sh --describe --bootstrap-server localhost:9092 --topic test

# group

➜  kafka_2.11-2.2.1 bin/kafka-consumer-groups.sh --bootstrap-server localhost:9092 --list
DemoConsumer
console-consumer-5965
console-consumer-42754
➜  kafka_2.11-2.2.1

# 基于flume流归档

https://yq.aliyun.com/articles/50487
https://www.cloudera.com/documentation/kafka/latest/topics/kafka_flume.html
https://www.oreilly.com/library/view/kafka-the-definitive/9781491936153/ch04.html

bin/flume-ng agent --conf conf --conf-file example.conf --name a1 -Dflume.root.logger=INFO,console
bin/flume-ng agent --conf conf --conf-file kafka-local.conf --name tier1 -Dflume.root.logger=INFO,console