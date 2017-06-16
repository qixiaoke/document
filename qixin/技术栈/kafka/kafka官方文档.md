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














