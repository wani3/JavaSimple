package inheritance;

public class Cat extends Terrestrial implements Run, Bite {

	@Override
	public void Bite() {
		System.out.println("Cat Bite..");
	}

	@Override
	public void Run() {
		System.out.println("Cat Run..");
	}

	@Override
	public void eat() {
		System.out.println("Cat eat..");
	}

	@Override
	public void breath() {
		System.out.println("Cat breath..");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep..");
	}
}
