package test2;

public class Test {
	private Object obj;
	public Test(Object obj){
		this.obj = obj;
	}
	public void test(){
		System.out.println(obj.getClass());
	}
}
