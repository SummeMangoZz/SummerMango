package IteratorPatterm;

import java.util.ArrayList;
import java.util.List;

public class MyCollection <E> implements Collection<E>{
	private List<E> list = new ArrayList<E>();
	
	@Override
	public void add(E obj){
		this.list.add(obj);
	}
	
	@Override
	public void remove(E obj){
		this.list.remove(obj);
	}
	
	@Override
	public int size() {
		return this.list.size();
	}
	
	//返回一个内部实现迭代器接口的具体迭代器
	@Override
	public MyIterator<E> getIterator(){
		return new MyIteratorImpl();
	}
	
	
	private class MyIteratorImpl implements MyIterator<E>{
		int current = -1;
		
		@Override
		public boolean hasNext() {
			if(current<size()-1){
				return true;
			}
			return false;
		}

		@Override
		public E next() {
			current++;
			return list.get(current);
		}
		
	}

}






