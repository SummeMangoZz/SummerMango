package ObserverPattern;

public interface Informer{
	
	public void addObserver(Observer observer);
	
	public void deleteObserver(Observer observer);
	
	//通知观察者，更改状态
	public void call();
	
	public String getState();
	
	public void setState(String state);
}


