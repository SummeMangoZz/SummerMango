package test6;

public class App {
	public static void main(String[] args) {
		IUserDao proxy = (IUserDao)ProxyFactory.getProxyInstance(new UserDao(), new Aop());
	    proxy.save();
	}
}
