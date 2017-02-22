package ProxyPattern;
/**
 * 代理模式的目的在与控制外部对真实对象的访问。用来限制真实对象的功能(当然也能增强，比如aop中的事务处理)
 * 为了不让外部知道代理对象所代理的真实对象，一般真实对象的创建过程在代理对象内部完成，不需要外部传入。
 * @author w
 *
 */
public class Proxy implements Action {
	private Man man;
	
	public Proxy() {
		man = new Man();
	}
	
	@Override
	public void sing() {
		man.sing();
	}

	@Override
	public void sendGift() {
		//因为是代理主要用来控制外部对真实对象的访问，所以可以通过权限判断，不调用真是对象的某个方法
		//装饰者模式主要用来装饰对象，添加对象的行外功能，所以相同的接口，尽管会扩展某些功能，但最终
		//一定还会调用被装饰的对象的相关接口
	}

}
