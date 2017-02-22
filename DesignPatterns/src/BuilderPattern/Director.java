package BuilderPattern;
/**
 * 指挥者类，用来控制建造过程，也用来隔离用户与建造过程的联系
 * 在客户端只要使用本类来建造产品，而不需要知道具体的建造过程
 * @author w
 *
 */
/**
 * 用这个类来控制建造过程
 * @author w
 *
 */
public class Director {
	 private Builder builder;
	 
	 public Director(Builder builder) {
		this.builder = builder; 
	 }
	 
	 /**
	  * 建造过程被确定下来，但各个部分的建造细节并不一样，因此可以根据相同的建造过程，通过建造细节的不同，
	  * 创建不同表示的对象
	  * 建造者模式就是将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
	  * 
	  */
	 public void buildProduct(){
		 builder.buildPartA();
		 builder.buildPartB();
		 builder.buildPartC();
	 }
}
