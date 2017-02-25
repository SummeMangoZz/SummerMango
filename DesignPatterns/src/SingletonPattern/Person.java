package SingletonPattern;

public class Person {
	//¶öººÊ½µ¥Àý
	private static Person person = new Person();
	private Person(){}
	
	public static Person getInstance(){
		return person;
	}
	
}
