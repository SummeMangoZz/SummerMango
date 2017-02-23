package ObserverPattern;
/**
 * 观察者模式:定义了一种一对多的依赖关系。让多个观察者对象同时监听一个主题对象，当主题
 * 对象在状态发生变化时，会通知所有观察者对象，使他们能够自动更新自己
 * @author w
 * 由于他们是双向耦合的，所以松耦合，就必须让它们依赖各自的抽象，而不是具体。
 *
 */
public abstract class Observer {
	private String name;
	private Informer sub;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Informer getSub() {
		return sub;
	}
	public void setSub(Informer sub) {
		this.sub = sub;
	}
	public Observer(String name,Informer sub) {
		this.name = name;
		this.sub = sub;
	}
	public abstract void update();
}
