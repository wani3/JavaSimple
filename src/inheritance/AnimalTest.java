package inheritance;

import java.util.Scanner;

public class AnimalTest {

	static void show(Animal animal) {
		animal.eat();
		animal.breath();
		animal.sleep();
		;
	}

	public static void main(String[] args) {
		/*
		 * Bird bird = new Bird(); Dog dog = new Dog(); Cat cat = new Cat();
		 * Fish fish = new Fish(); Chicken chicken = new Chicken(); Duck duck =
		 * new Duck();
		 */
		Animal bird = new Bird();
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal fish = new Fish();
		Animal chicken = new Chicken();
		Animal duck = new Duck();
		System.out.println("Input name animal :" + '\n' + "Bird" + "  " + "Dog"
				+ "  " + "Cat" + "  " + "Fish" + "  " + "Chicken" + "  "
				+ "Duck");
		Scanner sc = new Scanner(System.in);
		String animal = sc.nextLine();
		switch (animal) {
		case "Bird":
		case "bird":
			/*
			 * bird.Run(); bird.Bite(); bird.breath(); bird.eat();
			 */
			show(bird);

			break;

		case "Dog":
		case "dog":
			/*
			 * dog.Bite(); dog.Run(); dog.Swim(); dog.breath(); dog.eat();
			 */
			show(dog);
			break;
		case "Cat":
		case "cat":
			/*
			 * cat.Bite(); cat.Run(); cat.breath(); cat.eat();
			 */
			show(cat);
			break;
		case "Fish":
		case "fish":

			/*
			 * fish.Bite(); fish.Swim(); fish.breath(); fish.eat();
			 */
			show(fish);
			break;
		case "Chicken":
		case "chicken":
			/*
			 * chicken.Bite(); chicken.Fly(); chicken.Run(); chicken.breath();
			 * chicken.eat();
			 */
			show(chicken);
			break;
		case "Duck":
		case "duck":
			/*
			 * duck.Fly(); duck.Swim(); duck.Run(); duck.Bite(); duck.eat();
			 * duck.breath();
			 */
			show(duck);
			break;
		default:
			System.out.println("Name animal incorret.");
		}
	}
}
