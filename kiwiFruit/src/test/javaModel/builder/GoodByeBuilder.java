package test.javaModel.builder;

public class GoodByeBuilder extends Builder {
	
	public GoodByeBuilder(){
		msg = new GoodByeMessage();
	}
	@Override
	public void builderBody() {
		msg.setBody("欢送内容");

	}

	@Override
	public void builderSubject() {
		msg.setSubject("欢送标题");

	}

}
