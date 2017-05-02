package test.javaModel.observer;

import java.util.ArrayList;
import java.util.List;


public abstract class Subject {
	private List<Observer> list = new ArrayList<Observer>();
	public void attach(Observer observer){
		list.add(observer);
		System.out.println("add a Observer");
	}
	public void detach(Observer observer){
		list.remove(observer);
		System.out.println("remove a Observer");
	}
	public void nodifyObservers(String newState){
		for (Observer observer : list) {
			observer.update(newState);
		}
	}
}
