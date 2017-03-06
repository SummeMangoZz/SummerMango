package testJVM;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class testJVM {

	@Test
	public void test(){
		/*String a = "abc";
		String b = new String("abc");
		System.out.println(a==b);*/
		
		/*String a = new String("hello world");
		String b = a.intern(); //如果常量池中没有该字符串对象字面值相同的对象，将该对象添加进常量池中，并返回引用
		//String b = "hello world";
		String c = "hello world";
		System.out.println(b==c);*/
		Integer a = 1;
		Integer b = 1;
		System.out.println(a==b);
		final testJVM c = new testJVM();
		//ArrayList<Integer> list = {1,2,3,4};
	}
}





