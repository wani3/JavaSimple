package inheritance;

public class Chicken extends Poultry implements Fly, Run, Bite {

	@Override
	public void Bite() {

		System.out.println("Chicken Bite..");

	}

	@Override
	public void Run() {
		System.out.println("Chicken Run..");
	}

	@Override
	public void Fly() {
		System.out.println("Chicken Fly..");
	}
	@Override
	public void eat() {
		System.out.println("Chicken eat..");
	}
	@Override
	public void breath() {
		System.out.println("Chicken breath..");
	}
	@Override
	public void sleep() {
		System.out.println("Chicken sleep..");
	}
}
