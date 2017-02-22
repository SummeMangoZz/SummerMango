package BuilderPattern;
/**
 * 实现了建造者类的接口，同时重写了接口，指定了特定的建造过程
 * @author w
 *
 */
public class ConcreteBuilderA implements Builder{

	@Override
	public void buildPartA() {
		System.out.println("建造A部分");
	}

	@Override
	public void buildPartB() {
		System.out.println("建造B部分");
	}

	@Override
	public void buildPartC() {
		System.out.println("建造C部分");
	}
}


