package test.javaModel.builder;

public class WelcomeBuilder extends Builder {
	
	public WelcomeBuilder(){
		msg = new WelcomeMessage();
	}
	
	@Override
	public void builderBody() {
		msg.setBody("欢迎内容");

	}

	@Override
	public void builderSubject() {
		msg.setSubject("欢迎标题");

	}

}
