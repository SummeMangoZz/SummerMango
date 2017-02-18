package test1;

public class app_test1 {
	public void test(String s){
		s = "abc";
	}
	public static void main(String[] args) {
		String s = new String("123");
		app_test1 t = new app_test1();
		t.test(s);
		System.out.println(s);
	}
}
