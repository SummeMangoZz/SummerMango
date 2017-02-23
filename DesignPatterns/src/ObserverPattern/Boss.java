package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Informer {

	//������ת���߼�ģ�鲻Ӧ�������ͼ�ģ�飬��Ӧ�ö������ڳ���
		private List<Observer> observers = new ArrayList<Observer>();
		private String state; //����һ����ֻ����һ��״̬
		
		@Override
		public String getState() {
			return state;
		}

		@Override
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
