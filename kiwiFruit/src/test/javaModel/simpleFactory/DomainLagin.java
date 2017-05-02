package test.javaModel.simpleFactory;

public class DomainLagin implements SimpleFactory {

	public boolean verify(String name, String password) {
		if ("hengxiao".equals(name)) {
			return true;
		}
		return false;
	}

}
