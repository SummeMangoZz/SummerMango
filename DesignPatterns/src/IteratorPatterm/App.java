package IteratorPatterm;

public class App {
	public static void main(String[] args) {
		//ʹ�ýӿ����ý��ܾ���Ķ���
		//��������ԭ��������ͻ��������Ĳ��Ǿ���ʵ��,����һ������ӿ�
		Collection<Integer> collection = new MyCollection<Integer>();
		collection.add(1);
		collection.add(2);
		collection.add(3);
		collection.add(4);
		collection.add(5);
		
		//����һ��ʵ��MyIterator�ӿڵĶ���
		//��ͬ���϶���ı�����ʽ���ܲ�ͬ���ṩͳһ��Ԫ�ر����ӿڣ�����ʹ����Ŀ���ֲ���Լ���������ߺܶ�s
		MyIterator<Integer> iterator = collection.getIterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
}




