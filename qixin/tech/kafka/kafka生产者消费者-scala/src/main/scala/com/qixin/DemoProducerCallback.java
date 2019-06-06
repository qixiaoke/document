package com.qixin;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.RecordMetadata;

import java.util.Objects;

/**
 * Created by qixin on 2018/2/17.
 */
public class DemoProducerCallback implements Callback {
    @Override
    public void onCompletion(RecordMetadata metadata, Exception exception) {
        if(Objects.nonNull(exception)) {
            exception.printStackTrace();
        }
    }
}
