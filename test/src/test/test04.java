package test;

public class test04 {
	private static test04 test = new test04();
	private test04(){
		System.out.println("构造器被调用");
	}
	public static test04 getTest04(){
		return test;
	}
	public static test04 getTest() {
		return test;
	}
	public static void setTest(test04 test) {
		test04.test = test;
	}
	
	
}
