package ObserverPattern;
/**
 * �۲���ģʽ:������һ��һ�Զ��������ϵ���ö���۲��߶���ͬʱ����һ��������󣬵�����
 * ������״̬�����仯ʱ����֪ͨ���й۲��߶���ʹ�����ܹ��Զ������Լ�
 * @author w
 * ����������˫����ϵģ���������ϣ��ͱ����������������Եĳ��󣬶����Ǿ��塣
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
