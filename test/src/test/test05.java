package test;

import java.util.Date;

//�ַ����е�+�������java��Ψһ���ص����������һ�����ʽ�У�����ַ�����+�����������ͻ�
//jvmִ�е�ʱ��ͻᴴ��һ��StringBuilder����Ȼ��ͨ��append(Stirng s)����
//��+���ӵ��ַ��� ȫ�����ؽ�StringBuilder�����У�Ȼ��ͨ��

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
		System.out.println("����StringBuilder���ĵ�ʱ��Ϊ:"+(date2.getTime()-date1.getTime()));
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
		System.out.println("��StringBuilder���ĵ�ʱ��Ϊ:"+(date2.getTime()-date1.getTime()));
	}
	public static void main(String[] args) {
		test05 test = new test05();
		test.testString(null);
		test.testStringBuilder(null);
	}
}
