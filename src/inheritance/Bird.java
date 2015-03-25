package inheritance;

public class Bird extends Poultry implements Fly , Run , Bite {

	@Override
	public void Bite() {
		 System.out.println("Bird Bite.."); 
	}
	@Override
	public void Run() {
		 System.out.println("Bird Run.."); 
	}
	@Override
	public void Fly() {
		System.out.println("Bird Fly.."); 
	}
	@Override
	public void eat() {
		System.out.println("Bird eat.."); 
	}
	@Override
	public void breath() {	
		System.out.println("Bird breath.."); 
	}
	@Override
	public void sleep() {
		System.out.println("Bird sleep.."); 
	}
}
