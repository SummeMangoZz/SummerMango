package test6;

import java.awt.event.InvocationEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
	public static Object getProxyInstance(Object target,Aop aop){
		return Proxy.newProxyInstance(
				target.getClass().getClassLoader(),
				target.getClass().getInterfaces(),
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						aop.begin();
						method.invoke(target, args);
						aop.after();
						return null;
					}
				}
				);
	}
}
