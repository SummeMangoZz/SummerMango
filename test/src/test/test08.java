package test;

public class test08 {
	public void changeStr(String name){
		name="hello";
	}
	
	public static void main(String[] args) {
		test08 test = new test08();
		String name="sex";
		test.changeStr(name);
		System.out.println(name);
	}
}
