package test.javaModel.composite;

public class Leaf extends Component {
	private String name;
	
	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void printStruct(String perStr) {
		System.out.println(perStr + "-" + name);

	}

}
