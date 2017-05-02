package test.javaModel.builder;

import java.util.Date;

public abstract class Builder {
	protected AutoMessage msg;
	public void builderTo(String to){
		msg.setTo(to);
	}
	public void builderFrom(String from){
		msg.setFrom(from);
	}
	public void builderDate(Date date){
		msg.setDate(date);
	}
	public abstract void builderSubject();
	public abstract void builderBody();
	public void sendMsg(){
		msg.send();
	}
	
}
