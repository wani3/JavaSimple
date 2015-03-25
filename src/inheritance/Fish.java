package inheritance;

public class Fish extends Aquatic implements Swim , Bite {

	@Override
	public void Bite() {	
		System.out.println("Fish Bite.."); 
	}
	@Override
	public void Swim() {
		System.out.println("Fish Swim.."); 
	}
	@Override
	public void eat() {
		System.out.println("Fish eat.."); 
	}
	@Override
	public void breath() {	
		System.out.println("Fish breath.."); 
	}
	@Override
	public void sleep() {
		System.out.println("Fish sleep..");
	}
}
