package BuilderPattern;

public class App {
	public static void main(String[] args) {
		ConcreteBuilderA concreteBuilderA = new ConcreteBuilderA();
		ConcreteBuilderB concreteBuilderB = new ConcreteBuilderB();
		//负责指挥具体的建造过程
		Director directorA = new Director(concreteBuilderA);
		Director directorB = new Director(concreteBuilderB);
		directorA.buildProduct();
		directorB.buildProduct();
	}
}
