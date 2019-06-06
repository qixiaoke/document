
//import com.qixin.kafka.DMSMessage.PBPointTradeDMS
import org.apache.kafka.common.serialization.{Deserializer, Serializer}

//class PBPointTradeDMSFlinkSerDeTest extends Serializer[PBPointTradeDMS] with Deserializer[PBPointTradeDMS] {
//    override def serialize(topic: String, data: PBPointTradeDMS): Array[Byte] = {
//        data.toByteArray
//    }
//
//    override def deserialize(topic: String, data: Array[Byte]): PBPointTradeDMS = {
//        PBPointTradeDMS.parseFrom(data)
//    }
//
//    override def configure(configs: java.util.Map[String, _], isKey: Boolean): Unit = {}
//
//    override def close(): Unit = {}
//}
