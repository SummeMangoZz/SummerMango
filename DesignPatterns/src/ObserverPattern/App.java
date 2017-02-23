package ObserverPattern;

public class App {
	public static void main(String[] args) {
		Secretary secretary = new Secretary();
		Boss boss = new Boss();
		Observer Stockobserver = new StockObserver("wsh", secretary);
		Observer NBAobserver = new NBAObserver("xxb", boss);
		
		secretary.addObserver(Stockobserver);
		boss.addObserver(NBAobserver);
		
		secretary.setState("�ϰ������");
		boss.setState("�����ϰ�");
		secretary.call();
		boss.call();
	}
}
