package IteratorPatterm;
/**
 * 迭代器模式：
 *   为集合对象提供一个公共的遍历全部元素的接口，而不用关心集合的内部结构。
 * @author w
 *
 * @param <E>
 */
public interface MyIterator <E>{
	public boolean hasNext();
	public E next();
}
