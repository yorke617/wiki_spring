package test.javaModel.bridge;

public abstract class AbstractMessage {
	private MessageImplementor impl;

	public AbstractMessage(MessageImplementor impl) {
		this.impl = impl;
	}
	
	public void sendMsg(String touser,String msg){
		this.impl.sentMsg(touser, msg);
	}
	
}
