package BuilderPattern;
/**
 * 指挥者类，用来控制建造过程，也用来隔离用户与建造过程的联系
 * 在客户端只要使用本类来建造产品，而不需要知道具体的建造过程
 * @author w
 *
 */
public class Director {
	 private Builder builder;
	 
	 public Director(Builder builder) {
		this.builder = builder; 
	 }
	 
	 public void buildProduct(){
		 builder.buildPartA();
		 builder.buildPartB();
		 builder.buildPartC();
	 }
}
