
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


