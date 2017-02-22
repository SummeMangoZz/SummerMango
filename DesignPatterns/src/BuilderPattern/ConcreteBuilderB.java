package BuilderPattern;
/**
 * 实现了建造者类的接口，同时重写了接口，指定了特定的建造过程
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



