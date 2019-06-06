package com.qixin;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.Properties;

/**
 * Created by qixin on 2018/2/16.
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Properties props = new Properties();
//        props.put("zookeeper.connect", "192.168.99.100:2181");
        props.put("bootstrap.servers", "192.168.135.203:9092");
        props.put("group.id", "group-12");
//        props.put("enable.auto.commit", "true");
//        props.put("auto.commit.interval.ms", "1000");
//        props.put("auto.offset.reset", "earliest");
//        props.put("session.timeout.ms", "30000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");

        KafkaConsumer<String, String> kafkaConsumer = new KafkaConsumer<>(props);
        kafkaConsumer.subscribe(Arrays.asList("HelloKafkaTopic"));
        try {
            while (true) {
                ConsumerRecords<String, String> records = kafkaConsumer.poll(100);
                for (ConsumerRecord<String, String> record : records) {
                    System.out.printf("offset = %d, value = %s", record.offset(), record.value());
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            kafkaConsumer.close();
        }
    }
}
