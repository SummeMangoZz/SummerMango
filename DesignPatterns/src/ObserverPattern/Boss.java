package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Informer {

	//依赖倒转：高级模块不应该依赖低级模块，而应该都依赖于抽象
		private List<Observer> observers = new ArrayList<Observer>();
		private String state; //假设一个类只能有一个状态
		
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
		//通知观察者，更改状态
		public void call(){
			for (Observer observer : observers) {
				observer.update();
			}
		}

}
