##java文件复制方式对比

1. java FILE转为FileInputStream FileOutputStream

每个字节分别拷贝复制

-------------------------------------
2. java FILE转为FileInputStream FileOutputStream 

再转为BufferedInputStream BufferedOutputStream

再每个字节分别拷贝复制

--------------------------------------
3，java FILE转为FileInputStream FileOutputStream

以512字节为一个单位，拷贝复制

--------------------------------------
4. java FILE转为FileInputStream FileOutputStream 

再转为BufferedInputStream BufferedOutputStream

以512字节为一个单位，拷贝复制

>【对时间效率差异的解释】
 BufferedInputStream比FileInputStream多了一个缓冲区，执行read时先从缓冲区读取，当缓冲区数据读完时再把缓冲区填满。
 因此，当每次读取的数据量很小时，FileInputStream每次都是从硬盘读入，而BufferedInputStream大部分是从缓冲区读入。读取内存速度比读取硬盘速度快得多，因此BufferedInputStream效率高。
 BufferedInputStream的默认缓冲区大小是8192字节。当每次读取数据量接近或远超这个值时，两者效率就没有明显差别了。
 BufferedOutputStream和FileOutputStream同理，差异更明显一些。