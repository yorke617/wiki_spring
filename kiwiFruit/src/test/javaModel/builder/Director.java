package test.javaModel.builder;

import java.util.Date;

public class Director {
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void construct(String to,String from){
		builder.builderTo(to);
		builder.builderFrom(from);
		builder.builderDate(new Date());
		builder.builderSubject();
		builder.builderBody();
		builder.sendMsg();
	}
}
