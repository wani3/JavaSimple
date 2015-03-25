package inheritance;

public class Dog extends Terrestrial implements Swim , Run , Bite {

	@Override
	public void Bite() {
		
		System.out.println("Dog Bite.."); 

	}

	@Override
	public void Run() {
	
		System.out.println("Dog Run.."); 

	}

	@Override
	public void Swim() {
		System.out.println("Dog Swim.."); 
	}
	@Override
	public void eat() {
		System.out.println("Dog eat.."); 
	}
	@Override
	public void breath() {	
		System.out.println("Dog breath.."); 
	}
	@Override
	public void sleep() {		
		System.out.println("Dog sleep..");
	}
}
