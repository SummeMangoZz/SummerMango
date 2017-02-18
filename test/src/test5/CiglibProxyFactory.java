package test5;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * Ciglib������ͨ����������ķ�ʽ�������������ġ�������final���ε�class�಻��ͨ��ciglib��������������
 * @author w
 *
 */
public class CiglibProxyFactory implements MethodInterceptor{
	public Object target;
	
	public CiglibProxyFactory(Object target){
		this.target = target;
	}
	
	public Object getObjectInstance(){
		Enhancer en = new Enhancer();
		en.setSuperclass(target.getClass());
		en.setCallback(this);
		Object object = en.create();
		return object;
	}
	
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
		Object result;
		System.out.println("��ʼ����");
		result = arg1.invoke(target, arg2);
		System.out.println("��������");
		return result;
	}
	
}
