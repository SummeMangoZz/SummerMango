package DecoratorPattern;

public class App {
	public static void main(String[] args) {
		Man man = new Man();
		SuitDecoratorMan suitDecoratorMan = new SuitDecoratorMan(man);
		suitDecoratorMan.sing();
		suitDecoratorMan.sendGift();
	}
}
