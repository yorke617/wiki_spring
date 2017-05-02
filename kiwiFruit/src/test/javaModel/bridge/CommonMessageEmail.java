package test.javaModel.bridge;

public class CommonMessageEmail implements Message {

	public void send(String message, String toUser) {
		System.out.println("使用邮件短消息的方法，发送消息'"+message+"'给"+toUser);
	}

}
