package test.javaModel.observer;

public class ConcreteSubject extends Subject {
	private String state;
	public String getState(){
		return state;
	}
	
	public void change(String newState){
		state = newState;
		System.out.println("主题的状态为：" + state);
		super.nodifyObservers(newState);
	}
}
