package test.javaModel.bridge;

public class UrgencyMessageEmail implements UrgencyMessage {

	public Object watch(String messageId) {
		return null;
	}

	public void send(String message, String toUser) {
		message = "加急：" + message;
        System.out.println("使用邮件短消息的方法，发送消息'"+message+"'给"+toUser);
	}

}
