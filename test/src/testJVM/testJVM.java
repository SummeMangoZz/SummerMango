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
		String b = a.intern(); //�����������û�и��ַ�����������ֵ��ͬ�Ķ��󣬽��ö�����ӽ��������У�����������
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





