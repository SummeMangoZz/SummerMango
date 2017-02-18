package app01;

public class test {
	public static void main(String[] args) {
		AppleFactory factory1 = new AppleFactory();
		AppleFactory factory2 = new AppleFactory();
		Apple apple1 = factory1.getApple();
		Apple apple2 = factory2.getApple();
		System.out.println(apple1==apple2);
	}
}
