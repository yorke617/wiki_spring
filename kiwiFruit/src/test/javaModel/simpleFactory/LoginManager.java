package test.javaModel.simpleFactory;

public class LoginManager {
	public static SimpleFactory factory(String type) throws Exception  {
		SimpleFactory factory = null;
		if ("password".equals(type)) {
			factory = new PasswordLogin();
		}else if ("domain".equals(type)) {
			factory = new DomainLagin();
		} else {
			throw new Exception("获取验证对象出错！");
		}
		return factory;
	}
}
