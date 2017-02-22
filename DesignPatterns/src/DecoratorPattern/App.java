package DecoratorPattern;

public class App {
	public static void main(String[] args) {
		Man man = new Man();
		//װ�ο���Ƕ���һ���Ӱ��
		SuitSingDecoratorMan suitDecoratorMan = new SuitSingDecoratorMan(man);
		BuyGiftDecoratorMan buyGiftDecoratorMan = new BuyGiftDecoratorMan(suitDecoratorMan);
		
		buyGiftDecoratorMan.sendGift();
		buyGiftDecoratorMan.sing();
	}
}
