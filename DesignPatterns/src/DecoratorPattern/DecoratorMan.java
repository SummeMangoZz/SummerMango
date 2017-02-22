package DecoratorPattern;
/**
 * װ����ģʽ��Ŀ����װ�ζ����ԭ�й��ܡ��������һ��װ�����࣬��ô��û��Ҫ���һ��װ���߻���(������ָ����DescratorMan)
 * װ�λ����������Ϊ���װ�����ṩһ��ͳһ��װ�νӿڡ�
 * @author w
 *
 */
public class DecoratorMan implements Action{
	private Action action;
	
	public DecoratorMan(Action action) {
		this.action = action;
	}
	
	@Override
	public void sing() {
		action.sing();
	}
	
	@Override
	public void sendGift() {
		action.sendGift();
	}
	
	
}
