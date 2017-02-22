package DecoratorPattern;

public class Man implements Action {

	@Override
	public void sing() {
		System.out.println("i am sing");
	}

	@Override
	public void sendGift() {
		System.out.println("i am sendGifting");
	}

}
