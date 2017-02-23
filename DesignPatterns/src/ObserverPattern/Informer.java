package ObserverPattern;

public interface Informer{
	
	public void addObserver(Observer observer);
	
	public void deleteObserver(Observer observer);
	
	//֪ͨ�۲��ߣ�����״̬
	public void call();
	
	public String getState();
	
	public void setState(String state);
}


