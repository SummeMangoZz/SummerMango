package test10_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.sql.Time;
import java.util.LinkedList;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.xml.internal.ws.api.pipe.ThrowableContainerPropertySet;

import jdk.jfr.events.FileWriteEvent;
/**
 * 理解io，关键在于输入流流的数据源，以及输出流的输出源。装饰器模式是在原有的类的io基础上增添新的行为，如格式化输出

 * @author w
 *
 */
public class test10 {
	@Test
	public void test1() throws Exception {
		/*InputStream is = new FileInputStream("G:/contact.xml");
		DataInputStream dis = new DataInputStream(is);
		int readInt = dis.readInt();
		System.out.println(readInt);*/
		
		//System.out  是printStream类型，所以可以打印各种数据类型
		/*PrintStream out = System.out;
		PrintStream ps = new PrintStream("G:/test.txt");
		ps.print("hello");
		ps.print(true);
		ps.print(3);
		ps.close();*/
		
		/*PrintStream printStream = new PrintStream(System.out);
		printStream.println();*/
		/*ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
		DataOutputStream dos = new DataOutputStream(System.out);
		dos.write(4);;
		dos.flush();*/
		//hellotrue3
		byte[] b = new byte[1024];
		FileInputStream fis = new FileInputStream("G:/test.txt");
		int code = 0;
		long staTime = System.nanoTime();
		FileOutputStream fos = new FileOutputStream("G:/test.copy.txt");
		while((code = fis.read(b, 0, b.length))!=-1){
			fos.write(b, 0, code);
		}
		long endTime = System.nanoTime();
		System.out.println(endTime-staTime);///794545 901453 990828 752636 736386
		
		/*FileInputStream fis = new FileInputStream("G:/test.txt");
		int code = 0;
		long staTime = System.nanoTime();
		FileOutputStream fos = new FileOutputStream("G:/test.copy.txt");
		while((code = fis.read())!=-1){
			fos.write(code);
		}
		long endTime = System.nanoTime();
		//明显比采用数组作为缓冲的方式耗时，效率较低
		System.out.println(endTime-staTime);*///55196889 57670326 187592021 49294682 58098815
	}
		
	
	/**
	 * 测试结果：字符流比字节流慢。因为都设置了缓冲机制，且字符流还多一个解码的过程
	 * @throws Exception
	 */
	@Test
	public void test2() throws Exception {
		FileReader fr = new FileReader("G:/test.txt");
		int code = 0;
		long staTime = System.nanoTime();
		FileWriter fw = new FileWriter("G:/test.copy.txt");
		char[] c = new char[1024];
		while((code = fr.read(c, 0, c.length))!=-1){
			fw.write(c,0,code);
		}
		long endTime = System.nanoTime();
		fr.close();
		fw.close();
		System.out.println(endTime-staTime);//3602819 3248737 3765747 3084526 3477950
	}
	/**
	 * 缓冲字符流输入文件
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception{
		FileReader fr = new FileReader("G:/test.copy.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		String s = null;
		while((s = br.readLine()) != null){
			sb.append(s);  //在涉及到很多的字符串连接操作时，用stringbuilder能一定程度上提高效率
		}
		fr.close();
		br.close();
	    s = sb.toString();
	    System.out.println(s);
	}
	
	@Test
	public void test4() throws IOException {
		DataOutputStream dos = new DataOutputStream(System.out);
		PrintStream out = System.out;
		out.write(3);
		out.println("hello");
		//dos.writeChars("hello");
		//System.out.println(" world");
	}
	
	@Test
	public void test5() throws Exception {
		StringReader sr = new StringReader("heello world");//一个字符输入流，指定的字符串为输入数据源
		StringWriter sw = new StringWriter();//一个字符输出流，输出流的源伟该对象内部的StringBuffer对象
		char[] c = new char[20];
		int code = -1;
		while((code=sr.read(c, 0, c.length)) != -1){
			sw.write(c, 0, code);
		}
		sr.close();
		sw.close();
		System.out.println(sw.getBuffer().toString());
		System.out.println("hello");
		System.out.println((char)100);
	}
	
	/**
	 * @throws Exception
	 */
	@Test
	public void test6() throws Exception {
		//一个字节数输出流，该流的输出源为该对象中的 byte buf[]数组对象
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(100);//对应的字节为d
		byte[] b = baos.toByteArray();//返回baos对象中维护的一个字节数组
		System.out.println(new String(b));
		System.out.println(baos.toString());//将baos对象中维护的字节数组转换为为字符串
	}
	
	@Test
	public void test7() throws Exception {
		CharArrayWriter caw = new CharArrayWriter();
		caw.write(100);
		char[] c = caw.toCharArray();
		System.out.println(new String(c));
	}
	
	@Test
	public void test8() throws Exception {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("G:/test.copy.txt"));
		//返回的是读到的字节的整数值
		int read = bis.read(); //将读到的字节保存到该io对象内部的一个字节数组中。相当于在普通的输入流中添加了一个缓冲机制
		System.out.println((char)read);
		
	}
	
	/**
	 * flush的作用以及flush与close
	 * @throws Exception
	 */
	@Test
	public void test9() throws Exception {
		StringReader sr = new StringReader("hello world");
		OutputStream os = new FileOutputStream("G:/what.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		//FileWriter fw = new FileWriter("G:/what.txt");
		char[] c = new char[20];
		int count = 0;
		while((count=sr.read(c, 0, c.length)) != -1){
			osw.write(c, 0, count);
		}
		osw.write("helo");
		//osw.flush();
		//os.flush(); //这个方法在FileOutpustStream中没有覆盖，在抽象类OutputStream中什么也灭做
		sr.close();
		osw.close();
		
		//osw.close();
	}
	
	@Test
	public void test10() throws Exception {
		/*OutputStreamWriter osw = new OutputStreamWriter(System.out);
		osw.write("hello");*/
		/*FileReader fr = new FileReader("G:/test.txt");
		FileWriter fw = new FileWriter("G:/test.copy.txt");
		int count = 0;
		while((count = fr.read())!=-1){
			fw.write(count);
		}
		fw.write("我是谁");
		fw.flush();
		//fw.write(100);*/
		FileWriter fw = new FileWriter("G:/what.txt");
		fw.write(100);
		fw.write(101);
		//fw.close();
	}
	
	/**
	 * flush和close
	 * 在一些带有缓冲机制的io流中，最后一定要手动进行缓冲池的flush或者进行close(close方法中一般会自动进行缓冲数组的flush擦欧总)
	 * @throws Exception
	 */
	@Test
	public void test11() throws Exception {
		//StringBufferInputStream sbis = new StringBufferInputStream("wsh");
		//BufferedInputStream bis = new BufferedInputStream(sbis);
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		//bis.read();
		//查看源码发现，write并没有直接进行写操作，而是将该字节写到了改io对象内部维护的一个字节数组中。
	    //在字节数组装满数据时，才会针对这个字节数组进行写操作。避免了频繁的io操作，一定程度上能提高效率
		bos.write(100);
		//将缓冲字节数组中的数据全部进行写操作。
		bos.flush();  
		bos.close();  //一般close中自动会调用flush方法
	}
	
	/**
	 * 因为字符io流内置了一个缓冲数组，所以不必每次都进行io操作。而是取得一定的字节在转码成字符在输出
	 * 因此比每个字节都进行直接的io操作快很多。
	 * 因此在操作文本文件时，首选的是字符流
	 * @throws Exception
	 */
	@Test
	public void test12() throws Exception {
		FileOutputStream fos = new FileOutputStream("G:/test.txt");
		FileInputStream fis = new FileInputStream("G:/test.copy.txt");
		int count = 0;
		long staTime = System.nanoTime();
		while((count=fis.read())!=-1){
			fos.write(count);
		}
		long endTime = System.nanoTime();
		System.out.println(endTime-staTime);//291193079 314674067 381136611 291457785 297754704
	}
	
	@Test
	public void test13() throws Exception {
		FileReader fr = new FileReader("G:/test.txt");
		FileWriter fw = new FileWriter("G:/test.copy.txt");
		int count = 0;
		long staTime = System.nanoTime();
		while((count=fr.read())!=-1){
			fw.write(count);
		}
		long endTime = System.nanoTime();
		fr.close();
		fw.close();
		System.out.println(endTime-staTime);//312064214 59194037 67119390 90823176 66837578
	}
}








