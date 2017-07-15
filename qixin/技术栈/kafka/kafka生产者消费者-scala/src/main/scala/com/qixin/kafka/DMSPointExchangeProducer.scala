
import java.util.Properties

import com.qixin.kafka.DMSMessage.PBPointTradeDMS
import org.apache.kafka.clients.producer.{KafkaProducer, ProducerRecord}

object DMSPointExchangeProducer {
  def main(args: Array[String]): Unit = {
    val properties: Properties = new Properties()
    properties.setProperty("topic", "TOPIC")
    properties.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    properties.setProperty("value.serializer", classOf[PBPointTradeDMSFlinkSerDeTest].getName)
    properties.setProperty("bootstrap.servers", "10.199.212.123:9092,10.199.212.124:9092,10.199.212.125:9092")
    properties.setProperty("zookeeper.connect", "10.199.212.123:2181,10.199.212.124:2181,10.199.212.125:2181")

    Thread.currentThread.setContextClassLoader(null)
    val producer = new KafkaProducer[String, PBPointTradeDMS](properties)
    println("start to produce PBPointTradeDMS.")
    try {
      val pbPointTradeDMS = new PBPointTradeDMS()
      pbPointTradeDMS.setBroker("Broker")
      pbPointTradeDMS.setBuyExCode("BuyExCode")
      pbPointTradeDMS.setBuyExNum(1)
      pbPointTradeDMS.setOrderGroupId("1")
      pbPointTradeDMS.setOrderId("1")
      pbPointTradeDMS.setSellExCode("SellExCode")
      pbPointTradeDMS.setSellExNum(1)
      pbPointTradeDMS.setTradeId("1")
      pbPointTradeDMS.setTradeTime(System.currentTimeMillis())

     producer.send(new ProducerRecord[String, PBPointTradeDMS]("TOPIC",
       pbPointTradeDMS))
      println("send ok")
    } finally {
      producer.close()
    }
  }
}

