package StrategyPattern;

/**
 * 策略模式和简单工厂结合，彻底地屏蔽了算法的内部实现细节，同时对外开放一个简单的接口供外部调用，极大的提高了
 * 该程序的可扩展性
 * @author w
 *
 */
public class CushContext {
	private CushSuper cushSuper;
	public CushContext(String strategy){
		switch (strategy) {
		case "1":
			cushSuper = new CushRebate(1);
			break;
		case "2":
			cushSuper = new CushRebate(0.8);
			break;
		case "3":
			cushSuper = new CushReturn(300,100);
			break;
		}
	}
	public double getresult(double salary){
		return cushSuper.acceptCush(salary);
	}
}
