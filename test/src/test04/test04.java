package test04;

public class test04 {
	private test04 test = new test04();
	public test04(){
		System.out.println("构造方法在调用");
	}
	public static void main(String[] args) {
		System.out.println("..");
		test04 test = new test04();
		System.out.println("--");
	}
}
