package oo_operation;

import java.io.DataInputStream;

public class Tab {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("�������һ����:");
			double firNum = Double.parseDouble(dis.readLine());
			System.out.println("���������:");
			String operation = dis.readLine();
			System.out.println("������ڶ�����:");
			double secNum = Double.parseDouble(dis.readLine());
			try {
				Operation opera = OperationFactory.getOperation(operation);
				double result = opera.operat(firNum, secNum);
				System.out.println("�����:"+result);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}
}









