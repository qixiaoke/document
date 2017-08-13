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
