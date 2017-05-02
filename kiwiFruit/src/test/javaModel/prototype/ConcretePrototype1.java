package test.javaModel.prototype;

public class ConcretePrototype1 implements Prototype {
	private String name;
	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Prototype clone(){
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}

}
