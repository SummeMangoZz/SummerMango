package operation;

import java.io.DataInputStream;
/**
 * 负责展示页面
 * @author w
 *
 */
public class Tab {
	public static void main(String[] args) {
		Operation opera = new Operation();
		try {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("请输入第一个数:");
			double firNum = Double.parseDouble(dis.readLine());
			System.out.println("请输运算符:");
			String operation = dis.readLine();
			System.out.println("请输入第二个数:");
			double secNum = Double.parseDouble(dis.readLine());
			
			double result = opera.operat(firNum, secNum, operation);
			System.out.println("结果是:"+result);
		} catch (Exception e) {
			System.out.println("输入格式错误");
		}
		
	}
	
}
