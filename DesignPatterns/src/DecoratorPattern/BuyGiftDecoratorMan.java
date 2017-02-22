package DecoratorPattern;

public class BuyGiftDecoratorMan extends DecoratorMan {

	public BuyGiftDecoratorMan(Action action) {
		super(action);
	}
	
	@Override
	public void sendGift(){
		System.out.println("buy gift");
		super.sendGift();
	}
	
	

}
