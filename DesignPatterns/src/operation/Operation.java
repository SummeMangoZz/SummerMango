package operation;
/**
 * ���������߼�
 * @author w
 * 
 */
/**
 *��Ȼ���ڵ����⣬ֻ��һ���������ʱ�������������ȻҪ������롣
 */
public class Operation {
	public double operat(double firNum,double secNum,String operation){
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
		return result;
	}
}
