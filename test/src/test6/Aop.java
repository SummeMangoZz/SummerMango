package test6;

public class Aop {
	public void begin(){
		System.out.println("事务开始");
	}
	
	public void after(){
		System.out.println("事务结束");
	}
}
