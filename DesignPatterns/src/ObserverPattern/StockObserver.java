package ObserverPattern;

public class StockObserver extends Observer {

	public StockObserver(String name,Informer sub) {
		super(name, sub);
	}
	
	@Override
	public void update() {
		//��������Ȼ����Secretary��������ϣ������Բ���
		System.out.println(getSub().getState()+","+getName()+","+"�رչ�Ʊ���飬��������");
	}

}
