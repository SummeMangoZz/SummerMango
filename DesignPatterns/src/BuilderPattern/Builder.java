package BuilderPattern;
/**
 * 为创建一个product创建的抽象接口。
 * 因为一些复杂对象的构建的接口以及建造顺序是固定的，但对象内部的构建通常面临着复杂的变化
 * 所以这里之定义一些用来创建该对象的接口，具体的变化的过程交给实现该接口的子类去实现
 * @author w
 *
 */
public interface Builder {
	public void buildPartA();
	public void buildPartB();
	public void buildPartC();
}
