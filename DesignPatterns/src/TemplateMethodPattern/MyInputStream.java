package TemplateMethodPattern;

public abstract class MyInputStream <T>{
	private T result;
	public void getStringFromConsole(){
		getDataType();
		result = read();
		System.out.println("result="+this.result);
	}
	
	public abstract void getDataType();
	public abstract T read();
}
