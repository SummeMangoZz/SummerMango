package operation;

import java.io.DataInputStream;
import java.io.IOException;


public class Mix {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("请输入第一个数:");
		double firNum = Double.parseDouble(dis.readLine());
		System.out.println("请输运算符:");
		String operation = dis.readLine();
		System.out.println("请输入第二个数:");
		double secNum = Double.parseDouble(dis.readLine());
		double result = 0;
		try {
			switch (operation) {
			case "+":
				result = firNum+secNum;
				break;
			case "-":
				result = firNum-secNum;
				break;
			case "*":
				result = firNum*secNum;
				break;
			case "/":
				if (secNum != 0){
					result = firNum/secNum;
				}else{
					System.out.println("除数不能为0");
				}
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("输入的数据有误");
		}
	
		
		System.out.println("结果是:"+result);
		
	}
}





