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
		product.addPart("����A");
	}

	@Override
	public void buildPartB() {
		product.addPart("����B");
	}

	@Override
	public void buildPartC() {
		product.addPart("����C");
	}
	
	@Override
	public Product getProduct() {
		return this.product;
	}
}



