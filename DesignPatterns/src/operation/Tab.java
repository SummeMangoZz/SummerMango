package operation;

import java.io.DataInputStream;
/**
 * ����չʾҳ��
 * @author w
 *
 */
public class Tab {
	public static void main(String[] args) {
		Operation opera = new Operation();
		try {
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("�������һ����:");
			double firNum = Double.parseDouble(dis.readLine());
			System.out.println("���������:");
			String operation = dis.readLine();
			System.out.println("������ڶ�����:");
			double secNum = Double.parseDouble(dis.readLine());
			
			double result = opera.operat(firNum, secNum, operation);
			System.out.println("�����:"+result);
		} catch (Exception e) {
			System.out.println("�����ʽ����");
		}
		
	}
	
}
