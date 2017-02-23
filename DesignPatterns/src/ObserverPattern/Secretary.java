package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Secretary implements Informer{
	//������ת���߼�ģ�鲻Ӧ�������ͼ�ģ�飬��Ӧ�ö������ڳ���
	private List<Observer> observers = new ArrayList<Observer>();
	private String state; //����һ����ֻ����һ��״̬
	
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public void addObserver(Observer observer){
		this.observers.add(observer);
	}
	
	@Override
	public void deleteObserver(Observer observer){
		this.observers.remove(observer);
	}
	
	@Override
	//֪ͨ�۲��ߣ�����״̬
	public void call(){
		for (Observer observer : observers) {
			observer.update();
		}
	}
	
}



