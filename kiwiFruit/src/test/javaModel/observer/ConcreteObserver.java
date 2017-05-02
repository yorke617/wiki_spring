package test.javaModel.observer;

public class ConcreteObserver implements Observer {
	private String observerState;
	public String getObserverState(){
		return observerState;
	}
	public void update(String newState) {
		observerState = newState;
		System.out.println("观察者的状态为："+observerState);
	}

}
