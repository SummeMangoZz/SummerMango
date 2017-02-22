package BuilderPattern;
/**
 * 实现了建造者类的接口，同时重写了接口，指定了特定的建造过程
 * @author w
 *
 */
public class ConcreteBuilderA implements Builder{
	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.addPart("部件X");
	}

	@Override
	public void buildPartB() {
		product.addPart("部件Y");
	}

	@Override
	public void buildPartC() {
		product.addPart("部件Z");
	}

	@Override
	public Product getProduct() {
		return this.product;
	}
}


