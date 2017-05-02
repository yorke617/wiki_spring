package test.javaModel.decorator;

public class Brid extends Change {

	public Brid(TheGreatestSage sage){
		super(sage);
	}
	
	@Override
	public void move() {
		System.out.println("The brid is flying!");
		super.move();
	}

}
