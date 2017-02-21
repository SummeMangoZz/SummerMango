package oo_operation;

import java.io.DataInputStream;

public class Tab {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("请输入第一个数:");
			double firNum = Double.parseDouble(dis.readLine());
			System.out.println("请输运算符:");
			String operation = dis.readLine();
			System.out.println("请输入第二个数:");
			double secNum = Double.parseDouble(dis.readLine());
			try {
				Operation opera = OperationFactory.getOperation(operation);
				double result = opera.operat(firNum, secNum);
				System.out.println("结果是:"+result);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
	}
}









