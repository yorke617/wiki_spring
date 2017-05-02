package test.javaModel.decorator;

public class Change implements TheGreatestSage {
	private TheGreatestSage sage;
	
	public Change(TheGreatestSage sage) {
		this.sage = sage;
	}

	public void move() {
		sage.move();
	}

}
