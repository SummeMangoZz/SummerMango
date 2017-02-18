package test;


public class test09 {
	public void testA(){
		System.out.println("this is A");
		testB();
	}
	
	public void testB(){
		System.out.println("this is B");
	}
	public static void main(String[] args) {
		test09 test = new test09();
		test.testA();
		test.testC();
	}
	public void testC(){
		System.out.println("this is C");
	}
		
}
