package TemplateMethodPattern;

import java.io.InputStream;

/**
 * 模板方式模式将公共的算法细节以及处理过程在父类中实现，而将细节有变化的相关接口放在子类中实现。
 * 即定义算法的骨架，而将一些实现细节延迟到子类。
 * @author w
 *
 * @param <T> 泛型
 */
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





