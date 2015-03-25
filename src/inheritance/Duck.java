package inheritance;

public class Duck extends Poultry implements Fly , Swim , Run , Bite {

	@Override
	public void Bite() {
		System.out.println("Duck Bite.."); 
	}
	@Override
	public void Run() {
		System.out.println("Duck Run.."); 
	}
	@Override
	public void Swim() {
		System.out.println("Duck Swim.."); 
	}
	@Override
	public void Fly() {	
		System.out.println("Duck Fly.."); 
	}
	@Override
	public void eat() {
		System.out.println("Duck eat..");
	}
	@Override
	public void breath() {
		System.out.println("Duck breath..");
	}
	@Override
	public void sleep() {
		System.out.println("Duck sleep..");
	}
}
