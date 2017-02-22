package TemplateMethodPattern;

import java.io.InputStream;

/**
 * ģ�巽ʽģʽ���������㷨ϸ���Լ���������ڸ�����ʵ�֣�����ϸ���б仯����ؽӿڷ���������ʵ�֡�
 * �������㷨�ĹǼܣ�����һЩʵ��ϸ���ӳٵ����ࡣ
 * @author w
 *
 * @param <T> ����
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





