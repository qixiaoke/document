物理层
--
规定电气特征，传输0 1信号

链路层
--
确定0 1分组

一组电信号是一个数据包，叫做一帧。每一帧包括标头和数据。

标头含有mac地址， 以广播方式发送

网络层
--
header含有ip地址，同一子网络采用广播发送，不同子网络采用路由发送， 网络层解决不同子网络通讯

建立主机到主机的通信

不在一个子网络，就无法知道对方mac地址，必须通过网关转发

传输层
--
建立端口到端口的通信，实现程序之间的交流
TCP UDP协议就在这一层

应用层
--
