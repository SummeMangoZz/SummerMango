package test;

import java.util.Date;

//字符串中的+运算符是java中唯一重载的运算符。在一个表达式中，如果字符串用+连接起来，就会
//jvm执行的时候就会创建一个StringBuilder对象，然后通过append(Stirng s)方法
//将+连接的字符串 全部加载进StringBuilder对象中，然后通过

public class test05 {
	public void testString(String s){
		Date date1 = new Date();
		System.out.println(date1.getTime());
		for(int i=0;i<10000;i++){
			s = s+i;
		}
		Date date2 = new Date();
		System.out.println(date2.getTime());
		//System.out.println(s);
		System.out.println("不用StringBuilder消耗的时间为:"+(date2.getTime()-date1.getTime()));
	}
	
	public void testStringBuilder(String s){
		Date date1 = new Date();
		StringBuilder sb = new StringBuilder();
		System.out.println(date1.getTime());
		for(int i=0;i<10000;i++){
			sb.append(i);
		}
		s = sb.toString();
		Date date2 = new Date();
		System.out.println(date2.getTime());
		//System.out.println(s);
		System.out.println("用StringBuilder消耗的时间为:"+(date2.getTime()-date1.getTime()));
	}
	public static void main(String[] args) {
		test05 test = new test05();
		test.testString(null);
		test.testStringBuilder(null);
	}
}
