mvn compile 编译生成class文件
mvn package 打jar包
mvn install 发布到本地仓库

----
scope test 不会传递依赖

A -- l1.2.0

B -- l1.2.1

C -- A，B

C间接依赖l

C先依赖哪个就引用哪个l

A B 对l 来说，依赖级别相同，

依赖级别相同，哪个先依赖，就用哪个

依赖级别不同，依赖级别最短的


