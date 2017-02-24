package IteratorPatterm;

public interface Collection <E> {
	public void add(E obj);
	
	public void remove(E obj);
	
	public int size();
	
	public MyIterator<E> getIterator();
}
