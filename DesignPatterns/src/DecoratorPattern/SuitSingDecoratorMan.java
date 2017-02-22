package DecoratorPattern;


public class SuitSingDecoratorMan extends DecoratorMan {
	//通过构造器传入被修饰的对象
	public SuitSingDecoratorMan(Action action) {
		super(action);
	}
	
	@Override
	public void sing(){
		wearSuit();
		super.sing();
	}
	
	@Override
	public void sendGift(){
		super.sendGift();
	}
	
	public void wearSuit(){
		System.out.println("wear an suit");
	}
}






