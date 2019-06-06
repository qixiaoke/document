
import java.util.{Arrays, Properties, Random}

//import com.qixin.kafka.DMSMessage.PBPointTradeDMS
//import org.apache.kafka.clients.consumer.{ConsumerRecords, KafkaConsumer}



object DMSPointExchangeConsumer {
  def main(args: Array[String]): Unit = {
//    var consumer1: KafkaConsumer[String, PBPointTradeDMS] = null
//    val properties: Properties = new Properties()
//    properties.setProperty("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
//    properties.setProperty("value.deserializer", classOf[PBPointTradeDMSFlinkSerDeTest].getName)
//    properties.setProperty("bootstrap.servers", "10.199.212.123:9092,10.199.212.124:9092,10.199.212.125:9092")
//    properties.setProperty("zookeeper.connect", "10.199.212.123:2181,10.199.212.124:2181,10.199.212.125:2181")
//
//    if (properties.getProperty("group.id") == null) {
//      properties.setProperty("group.id", "group-" + new Random().nextInt(100000))
//    }
//    consumer1 = new KafkaConsumer[String, PBPointTradeDMS](properties)
//    consumer1.subscribe(Arrays.asList("TOPIC"))
//    val start: Long = System.nanoTime
//    println("start to consume Android msgpush. begin at:" + start)
//    var count: Int = 0
//    while (true) {
//      val records: ConsumerRecords[String, PBPointTradeDMS] = consumer1.poll(2000)
//      import scala.collection.JavaConversions._
//      for (record <- records) {
//        count += 1
//        println("The " + count + "th record: " + record.value.toString)
//      }
//    }
  }
}