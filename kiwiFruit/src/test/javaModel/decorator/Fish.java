package test.javaModel.decorator;

public class Fish extends Change {

	public Fish(TheGreatestSage sage) {
		super(sage);
		
	}

	@Override
	public void move() {
		System.out.println("The fish is swimming!");
	}
	
}
