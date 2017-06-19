kafka四个API

- 1 Producer API
- 2 Consumer API
- 3 Streams API  ？？
- 4 Connector API (从库读还是写库？)

kafka客户端服务器通过tcp连接。
客户端 服务器具体指？？？ 

每个topic由一个或多个partition组成

![](https://ooo.0o0.ooo/2017/06/16/5943c5f98c6b2.png)

每个partition都是由一个有序的，不可变的序列组成，该序列不断追加。
每个partition的数据分配给唯一id，叫做偏移量

kafka的性能与数据存储大小无关，所有数据可以保存很长时间也无所谓

offset由consumer决定，consumer可以在任意地方读取

实现consumer的代价很小，consumer的增加减少对其他消费者几乎没有影响

分区可以让数据在机器承受的范围内，也保证了并行处理

每个partition有一个leader，和0个或多个followers。leader处理所有的读写，同步到followers。
leader挂了，其中的一个follower自动成为新的leader。一个服务器充当一些partition的leader和另外一些partition的follower，
以达到负载均衡。

producer负责选择写入topic的哪个partition（**重要**），可以选用轮询方法或其他复杂算法负载均衡

consumer可以组成cosumer group，一个topic被comsumer group中的一个consumer消费，会均衡到每个cosumer group中每个consumer

![](https://ooo.0o0.ooo/2017/06/16/5943db8e1afe5.png)

传统消息模式有两种：

1.队列：可以分配给多个消费者去处理，可扩展处理能力，但不支持多个订阅者

2.发布订阅：支持多个订阅者，但会推送给每个订阅者

kafka既可以分配给多个消费者（consumer group）扩展处理能力，又可以给多个订阅者

















