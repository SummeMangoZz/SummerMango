package operation;

import java.io.DataInputStream;
import java.io.IOException;


public class Mix {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		DataInputStream dis = new DataInputStream(System.in);
		System.out.println("�������һ����:");
		double firNum = Double.parseDouble(dis.readLine());
		System.out.println("���������:");
		String operation = dis.readLine();
		System.out.println("������ڶ�����:");
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
					System.out.println("��������Ϊ0");
				}
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("�������������");
		}
	
		
		System.out.println("�����:"+result);
		
	}
}





