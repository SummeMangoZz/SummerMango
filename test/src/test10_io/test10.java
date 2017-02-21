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
 * ���io���ؼ�������������������Դ���Լ�����������Դ��װ����ģʽ����ԭ�е����io�����������µ���Ϊ�����ʽ�����

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
		
		//System.out  ��printStream���ͣ����Կ��Դ�ӡ������������
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
		//���ԱȲ���������Ϊ����ķ�ʽ��ʱ��Ч�ʽϵ�
		System.out.println(endTime-staTime);*///55196889 57670326 187592021 49294682 58098815
	}
		
	
	/**
	 * ���Խ�����ַ������ֽ���������Ϊ�������˻�����ƣ����ַ�������һ������Ĺ���
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
	 * �����ַ��������ļ�
	 * @throws Exception 
	 */
	@Test
	public void test3() throws Exception{
		FileReader fr = new FileReader("G:/test.copy.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		String s = null;
		while((s = br.readLine()) != null){
			sb.append(s);  //���漰���ܶ���ַ������Ӳ���ʱ����stringbuilder��һ���̶������Ч��
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
		StringReader sr = new StringReader("heello world");//һ���ַ���������ָ�����ַ���Ϊ��������Դ
		StringWriter sw = new StringWriter();//һ���ַ���������������Դΰ�ö����ڲ���StringBuffer����
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
		//һ���ֽ�������������������ԴΪ�ö����е� byte buf[]�������
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(100);//��Ӧ���ֽ�Ϊd
		byte[] b = baos.toByteArray();//����baos������ά����һ���ֽ�����
		System.out.println(new String(b));
		System.out.println(baos.toString());//��baos������ά�����ֽ�����ת��ΪΪ�ַ���
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
		//���ص��Ƕ������ֽڵ�����ֵ
		int read = bis.read(); //���������ֽڱ��浽��io�����ڲ���һ���ֽ������С��൱������ͨ���������������һ���������
		System.out.println((char)read);
		
	}
	
	/**
	 * flush�������Լ�flush��close
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
		//os.flush(); //���������FileOutpustStream��û�и��ǣ��ڳ�����OutputStream��ʲôҲ����
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
		fw.write("����˭");
		fw.flush();
		//fw.write(100);*/
		FileWriter fw = new FileWriter("G:/what.txt");
		fw.write(100);
		fw.write(101);
		//fw.close();
	}
	
	/**
	 * flush��close
	 * ��һЩ���л�����Ƶ�io���У����һ��Ҫ�ֶ����л���ص�flush���߽���close(close������һ����Զ����л��������flush��ŷ��)
	 * @throws Exception
	 */
	@Test
	public void test11() throws Exception {
		//StringBufferInputStream sbis = new StringBufferInputStream("wsh");
		//BufferedInputStream bis = new BufferedInputStream(sbis);
		BufferedOutputStream bos = new BufferedOutputStream(System.out);
		//bis.read();
		//�鿴Դ�뷢�֣�write��û��ֱ�ӽ���д���������ǽ����ֽ�д���˸�io�����ڲ�ά����һ���ֽ������С�
	    //���ֽ�����װ������ʱ���Ż��������ֽ��������д������������Ƶ����io������һ���̶��������Ч��
		bos.write(100);
		//�������ֽ������е�����ȫ������д������
		bos.flush();  
		bos.close();  //һ��close���Զ������flush����
	}
	
	/**
	 * ��Ϊ�ַ�io��������һ���������飬���Բ���ÿ�ζ�����io����������ȡ��һ�����ֽ���ת����ַ������
	 * ��˱�ÿ���ֽڶ�����ֱ�ӵ�io������ܶࡣ
	 * ����ڲ����ı��ļ�ʱ����ѡ�����ַ���
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








