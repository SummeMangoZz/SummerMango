package test7;

import java.lang.reflect.Method;

public class app {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("test7.StaticMethodClass");
		Method method = clazz.getMethod("save",int.class);
	    //���Ҫ������ľ�̬�������Ͳ���������������ʵ���������������
		method.invoke(null, 4);
		
	}
}
