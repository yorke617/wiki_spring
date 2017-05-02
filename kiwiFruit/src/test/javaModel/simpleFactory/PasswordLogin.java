package test.javaModel.simpleFactory;

public class PasswordLogin implements SimpleFactory {

	public boolean verify(String name, String password) {
		if ("yangyk".equals(name)) {
			return true;
		}
		return false;
	}

}
