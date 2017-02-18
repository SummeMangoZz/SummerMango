package test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;


public class test12 {
	@Test
	public void test1(){
		List list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Iterator iterator = list.iterator();
		for(int i = (int)iterator.next()/*这段语句只在第一次执行for循环时执行，因此永远为1*/;iterator.hasNext();){
			System.out.println(i);
		}
		for(;iterator.hasNext();){
			System.out.println(iterator.next());
		}
		/*while(iterator.hasNext()){
			System.out.println(iterator.next());
		}*/
	}
	
	@Test
	public void test2() throws Exception {
		Apple apple = new Apple("苹果");
		FileOutputStream fis = new FileOutputStream("G:/apple");
		ObjectOutputStream ous = new ObjectOutputStream(fis);
		ous.writeObject(apple);
		ous.close();
				
	}
	
	@Test
	public void test3() throws Exception {
		FileInputStream fis = new FileInputStream("G:/apple");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Apple apple = (Apple)ois.readObject();
		System.out.println(apple.getName());
	}
}











