package test.javaModel.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> components = new ArrayList<Component>();
	private String name;
	@Override
	public void printStruct(String perStr) {
		System.out.println(perStr+"+"+name);
		if (components != null && components.size()>0 ) {
			perStr += "  ";
			for (Component component : components) {
				component.printStruct(perStr);
			}
		}

	}
	@Override
	public void addChild(Component child) {
		components.add(child);
	}
	@Override
	public List<Component> getChild() {
		return components;
	}
	@Override
	public void removeChild(int index) {
		components.remove(index);
	}
	public Composite(String name) {
		this.name = name;
	}
	
	
	

}
