package ObserverPattern;

public class NBAObserver extends Observer {
	

	public NBAObserver(String name, Informer sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(getSub().getState()+","+getName()+","+"�ر�NBAֱ������������");
	}

}
