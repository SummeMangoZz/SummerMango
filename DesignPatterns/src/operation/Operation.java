package operation;
/**
 * 负责运算逻辑
 * @author w
 * 
 */
/**
 *依然存在的问题，只有一种运算进行时，其他的情况依然要参与编译。
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
					System.out.println("除数不能为0");
				}
				break;
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println("输入的数据有误");
		}
		return result;
	}
}
