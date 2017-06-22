##1. 添加文件my.ini文件，放入mysql根目录

[mysql]
# 设置mysql客户端默认字符集
default-character-set=utf8
[mysqld]
#设置3306端口
port = 3306
# 设置mysql的安装目录
basedir=D:\mysql5.7
# 设置mysql数据库的数据的存放目录
datadir=D:\mysql5.7\data
# 允许最大连接数
max_connections=200
# 服务端使用的字符集默认为8比特编码的latin1字符集
character-set-server=utf8
# 创建新表时将使用的默认存储引擎
default-storage-engine=INNODB


##2. 初始化数据库
mysqld --initialize --user=mysql --console

记住分配的密码

##3. 安装服务
mysqld --install MySQL

##4. 启动服务
net start MySQL

##5. 停止服务
net stop MySQL

##6. 登陆
mysql –uroot -p  

##7. 登陆后修改初始密码
set password for root@localhost=password('你的密码');
