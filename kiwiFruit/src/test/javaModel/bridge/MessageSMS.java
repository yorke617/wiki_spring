package test.javaModel.bridge;

public class MessageSMS implements MessageImplementor {

	public void sentMsg(String touser, String msg) {
		System.out.println("使用系统内短消息的方法，发送消息'"+msg+"'给"+touser);

	}

}
