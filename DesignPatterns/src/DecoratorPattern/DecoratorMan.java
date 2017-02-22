package DecoratorPattern;
/**
 * 装饰者模式的目的是装饰对象的原有功能。如果仅有一个装饰器类，那么就没必要设计一个装饰者基类(在这里指的是DescratorMan)
 * 装饰基类的作用是为多个装饰类提供一个统一的装饰接口。
 * @author w
 *
 */
public class DecoratorMan implements Action{
	private Action action;
	
	public DecoratorMan(Action action) {
		this.action = action;
	}
	
	@Override
	public void sing() {
		action.sing();
	}
	
	@Override
	public void sendGift() {
		action.sendGift();
	}
	
	
}
