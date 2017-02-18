package test7;

import java.lang.reflect.Method;

public class app {
	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("test7.StaticMethodClass");
		Method method = clazz.getMethod("save",int.class);
	    //如果要调用类的静态方法，就不传入对象，如果调用实例方法，传入对象
		method.invoke(null, 4);
		
	}
}
