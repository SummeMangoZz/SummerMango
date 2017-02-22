package BuilderPattern;
/**
 * ʵ���˽�������Ľӿڣ�ͬʱ��д�˽ӿڣ�ָ�����ض��Ľ������
 * @author w
 *
 */
public class ConcreteBuilderB implements Builder {
	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.addPartA();
	}

	@Override
	public void buildPartB() {
		product.addPartB();
	}

	@Override
	public void buildPartC() {
		product.addPartC();
	}
	
	public Product getResult(){
		return this.product;
	}
}



