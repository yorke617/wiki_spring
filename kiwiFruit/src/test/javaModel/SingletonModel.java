package test.javaModel;

public class SingletonModel {
	/*通过JVM加载机制进行同步控制
	 * 类级内部类相当于其外部类的成员，只有在第一次被使用的时候才被会装载
	 */
	private SingletonModel(){}
	
	private static class SingletonHolder{
		private static SingletonModel singletonModel = new SingletonModel();
	}
	
	public static SingletonModel getInstance(){
		return SingletonHolder.singletonModel;
	}
	/*
	private volatile static SingletonModel singletonModel = null;
	private SingletonModel(){}
	public static SingletonModel getInstance(){
		if (singletonModel == null) {
			synchronized(SingletonModel.class){
				if (singletonModel == null) {
					singletonModel = new SingletonModel();
				}
			}
		}
		return singletonModel;
	}
	 */
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
