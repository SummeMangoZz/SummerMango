package ObserverPattern;

public class StockObserver extends Observer {

	public StockObserver(String name,Informer sub) {
		super(name, sub);
	}
	
	@Override
	public void update() {
		//该类中依然与类Secretary产生了耦合，复用性不高
		System.out.println(getSub().getState()+","+getName()+","+"关闭股票行情，继续工作");
	}

}
