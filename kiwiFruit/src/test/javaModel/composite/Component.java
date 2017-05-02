package test.javaModel.composite;

import java.util.List;

public abstract class Component {
	public abstract void printStruct(String perStr);
	public void addChild(Component child){
		throw new RuntimeException("对象不支持此功能");
	}
	public void removeChild(int index){
		throw new RuntimeException("对象不支持此功能");
	}
	public List<Component> getChild(){
		throw new RuntimeException("对象不支持此功能");
	}
}
