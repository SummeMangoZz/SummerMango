package DecoratorPattern;


public class SuitSingDecoratorMan extends DecoratorMan {
	//ͨ�����������뱻���εĶ���
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






