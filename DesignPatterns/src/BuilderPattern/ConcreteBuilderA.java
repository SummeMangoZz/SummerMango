package BuilderPattern;
/**
 * ʵ���˽�������Ľӿڣ�ͬʱ��д�˽ӿڣ�ָ�����ض��Ľ������
 * @author w
 *
 */
public class ConcreteBuilderA implements Builder{

	@Override
	public void buildPartA() {
		System.out.println("����A����");
	}

	@Override
	public void buildPartB() {
		System.out.println("����B����");
	}

	@Override
	public void buildPartC() {
		System.out.println("����C����");
	}
}


