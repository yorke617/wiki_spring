package test.javaModel.flyweight;

public class ConcreteFlyweight implements Flyweight {
	private Character intrinsicState = null;
	
	public Character getIntrinsicState() {
		return intrinsicState;
	}

	public void setIntrinsicState(Character intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	public ConcreteFlyweight(Character intrinsicState) {
		this.intrinsicState = intrinsicState;
	}

	public void operation(String state) {
		System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + state);

	}

}
