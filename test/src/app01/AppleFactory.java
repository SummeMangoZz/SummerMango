package app01;

public class AppleFactory {
	//通过工厂产生单例的apple
	private static Apple apple = new Apple();
	public static Apple getApple(){
		return apple;
	}
}
