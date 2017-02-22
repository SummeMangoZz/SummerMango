package BuilderPattern;
/**
 * ʵ���˽�������Ľӿڣ�ͬʱ��д�˽ӿڣ�ָ�����ض��Ľ������
 * @author w
 *
 */
public class ConcreteBuilderA implements Builder{
	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.addPart("����X");
	}

	@Override
	public void buildPartB() {
		product.addPart("����Y");
	}

	@Override
	public void buildPartC() {
		product.addPart("����Z");
	}

	@Override
	public Product getProduct() {
		return this.product;
	}
}


