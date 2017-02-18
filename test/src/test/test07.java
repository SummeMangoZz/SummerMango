package test;

public class test07 {
	public int a(){
		return 2;
	}
	public int b(){
		return 3;
	}
	public static void main(String[] args) {
		test07 test = new test07();
		System.out.println(test.a()+test.b());
	}
}
