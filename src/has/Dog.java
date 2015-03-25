package has;

public class Dog extends Animal {

	public void showDog(Dog dog) {
		System.out.println("Dog Name :  " + dog.getName());
		System.out.println("Dog Color : " + dog.getColor());
		System.out.println("Dog Sex : " + dog.getSex());
		System.out.println("Dog Size : " + dog.getSize());
		dog.breath();
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Dog Breath.");

	}

}
