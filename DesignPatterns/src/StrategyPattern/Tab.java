package StrategyPattern;

import java.io.DataInputStream;
import java.io.IOException;

public class Tab {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("��������Ʒ�ĵ���:");
		String price = dis.readLine();
		System.out.println("��������Ʒ������");
		String num = dis.readLine();
		System.out.println("��ѡ����Ʒ�Ĵ�����ʽ:");
		System.out.println("1.�����շ�");
		System.out.println("2.�����");
		System.out.println("3.��300��100");
		String strategy = dis.readLine();
		
		/**
		 * ���ò���ģʽ�����׵��������㷨ʵ��ϸ�ڣ�ͬʱ�����ṩ��һ���򵥵ؽӿڹ��ⲿ���á�
		 */
		CushContext context = new CushContext(strategy);
		double total = 0;
		total += context.getresult(Double.parseDouble(price)*Double.parseDouble(num));
		System.out.println("�ܼ�Ϊ:"+total);
	}
}





