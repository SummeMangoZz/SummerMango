package DecoratorPattern;

public class App {
	public static void main(String[] args) {
		Man man = new Man();
		//装饰可以嵌套且互不影响
		SuitSingDecoratorMan suitDecoratorMan = new SuitSingDecoratorMan(man);
		BuyGiftDecoratorMan buyGiftDecoratorMan = new BuyGiftDecoratorMan(suitDecoratorMan);
		
		buyGiftDecoratorMan.sendGift();
		buyGiftDecoratorMan.sing();
	}
}
