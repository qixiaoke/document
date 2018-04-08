
public class StringTest {
    public static void main(String[] args) {
        String baseStr = "baseStr";

        String str1 = "baseStr01";
        String str2 = "baseStr" + "01";
        String str3 = baseStr + "01";

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
    }
}

javac String.java
javap -v StringTest.class
输出结果Classfile /D:/myProject/StringTest.class
  Last modified 2017-9-10; size 802 bytes
  MD5 checksum 5b5efd6f29ca134e3fdd52cd1b65f33a
  Compiled from "StringTest.java"
public class StringTest
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #12.#25        // java/lang/Object."<init>":()V
   #2 = String             #26            // baseStr
   #3 = String             #27            // baseStr01
   #4 = Class              #28            // java/lang/StringBuilder
   #5 = Methodref          #4.#25         // java/lang/StringBuilder."<init>":()V
   #6 = Methodref          #4.#29         // java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
   #7 = String             #30            // 01
   #8 = Methodref          #4.#31         // java/lang/StringBuilder.toString:()Ljava/lang/String;
   #9 = Fieldref           #32.#33        // java/lang/System.out:Ljava/io/PrintStream;
  #10 = Methodref          #34.#35        // java/io/PrintStream.println:(Z)V
  #11 = Class              #36            // StringTest
  #12 = Class              #37            // java/lang/Object
  #13 = Utf8               <init>
  #14 = Utf8               ()V
  #15 = Utf8               Code
  #16 = Utf8               LineNumberTable
  #17 = Utf8               main
  #18 = Utf8               ([Ljava/lang/String;)V
  #19 = Utf8               StackMapTable
  #20 = Class              #38            // "[Ljava/lang/String;"
  #21 = Class              #39            // java/lang/String
  #22 = Class              #40            // java/io/PrintStream
  #23 = Utf8               SourceFile
  #24 = Utf8               StringTest.java
  #25 = NameAndType        #13:#14        // "<init>":()V
  #26 = Utf8               baseStr
  #27 = Utf8               baseStr01
  #28 = Utf8               java/lang/StringBuilder
  #29 = NameAndType        #41:#42        // append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
  #30 = Utf8               01
  #31 = NameAndType        #43:#44        // toString:()Ljava/lang/String;
  #32 = Class              #45            // java/lang/System
  #33 = NameAndType        #46:#47        // out:Ljava/io/PrintStream;
  #34 = Class              #40            // java/io/PrintStream
  #35 = NameAndType        #48:#49        // println:(Z)V
  #36 = Utf8               StringTest
  #37 = Utf8               java/lang/Object
  #38 = Utf8               [Ljava/lang/String;
  #39 = Utf8               java/lang/String
  #40 = Utf8               java/io/PrintStream
  #41 = Utf8               append
  #42 = Utf8               (Ljava/lang/String;)Ljava/lang/StringBuilder;
  #43 = Utf8               toString
  #44 = Utf8               ()Ljava/lang/String;
  #45 = Utf8               java/lang/System
  #46 = Utf8               out
  #47 = Utf8               Ljava/io/PrintStream;
  #48 = Utf8               println
  #49 = Utf8               (Z)V
{
  public StringTest();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 2: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=5, args_size=1
         0: ldc           #2                  // String baseStr   加载常量池中的第二项（"baseStr"）到栈中
         2: astore_1                        //  将1中的引用赋值给第一个局部变量，即String baseStr = "baseStr"；
         3: ldc           #3                  // String baseStr01
         5: astore_2
         6: ldc           #3                  // String baseStr01
         8: astore_3
         9: new           #4                  // class java/lang/StringBuilder   生成StringBuilder的实例
        12: dup                                //  复制生成对象的引用并压入栈中
        13: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V   调用常量池中的第五项，即StringBuilder.<init>方法
        16: aload_1                                //  加载第一个参数的值，即"baseStr"
        17: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;   调用StringBuilder对象的append方法
        20: ldc           #7                  // String 01   加载常量池中的第七项（"01"）到栈中
        22: invokevirtual #6                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;   调用StringBuilder.append方法
        25: invokevirtual #8                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;   调用StringBuilder.toString方法
        28: astore        4                        //  将29中的结果引用赋值改第4个局部变量，即对变量str3的赋值
        30: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        33: aload_2
        34: aload_3
        35: if_acmpne     42
        38: iconst_1
        39: goto          43
        42: iconst_0
        43: invokevirtual #10                 // Method java/io/PrintStream.println:(Z)V
        46: getstatic     #9                  // Field java/lang/System.out:Ljava/io/PrintStream;
        49: aload_2
        50: aload         4
        52: if_acmpne     59
        55: iconst_1
        56: goto          60
        59: iconst_0
        60: invokevirtual #10                 // Method java/io/PrintStream.println:(Z)V
        63: return
      LineNumberTable:
        line 4: 0
        line 6: 3
        line 7: 6
        line 8: 9
        line 10: 30
        line 11: 46
        line 12: 63
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 42
          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
          stack = [ class java/io/PrintStream ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
          stack = [ class java/io/PrintStream, int ]
        frame_type = 79 /* same_locals_1_stack_item */
          stack = [ class java/io/PrintStream ]
        frame_type = 255 /* full_frame */
          offset_delta = 0
          locals = [ class "[Ljava/lang/String;", class java/lang/String, class java/lang/String, class java/lang/String, class java/lang/String ]
          stack = [ class java/io/PrintStream, int ]
}
SourceFile: "StringTest.java"


ldc：Push item from run-time constant pool，从常量池中加载指定项的引用到栈。

对于final字段，编译期直接进行了常量替换，而对于非final字段则是在运行期进行赋值处理的。


#############################################################

public class StringTest {
    public static void main(String[] args) {
        String str2 = new String("str")+new String("01");
        str2.intern();
        String str1 = "str01";
        System.out.println(str2==str1);


String s1=new String("kvill");
s1.intern();
String s0= "kvill";
System.out.println( s0==s1);
    }
}

结果： true false
栈中str2指向string对象。执行str2.intern，常量区没有str01，jdk7以上就在堆中建立str01，str2直接指向。
s1=new String("kvill")产生String和常量kvill. s1.intern没有把返回指向常量赋值，所以还是false
