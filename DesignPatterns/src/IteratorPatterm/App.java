package IteratorPatterm;

public class App {
	public static void main(String[] args) {
		//使用接口引用接受具体的对象
		//依赖导致原则，在这里客户端依赖的不是具体实现,而是一个抽象接口
		Collection<Integer> collection = new MyCollection<Integer>();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		collection.add(5);
		
		//返回一个实现MyIterator接口的对象。
		//不同集合对象的遍历方式可能不同，提供统一的元素遍历接口，可以使代码的可移植性以及重用性提高很多s
		MyIterator<Integer> iterator = collection.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}




