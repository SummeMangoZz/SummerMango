package SingletonPattern;

public class Person {
	//����ʽ����
	private static Person person = new Person();
	private Person(){}
	
	public static Person getInstance(){
		return person;
	}
	
}
