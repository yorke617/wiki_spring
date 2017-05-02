package test.javaModel.bridge;

public class UrgencyMessage1 extends AbstractMessage {

	public UrgencyMessage1(MessageImplementor impl) {
		super(impl);
	}

	@Override
	public void sendMsg(String touser, String msg) {
		msg = "加急：" + msg;
		super.sendMsg(touser, msg);
	}
	
}
