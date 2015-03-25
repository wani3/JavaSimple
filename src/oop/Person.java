package oop;

public class Person {
	String title;
	String firstName;
	String lastName;
	int age;

	public Person() {// name same class.
		// System.out.println("This is default counstuctor.");
		firstName = "John";
		lastName = "Don";

	}

	public Person(String firstName1, String lastName1) {// name same class.
		// System.out.println("This is default counstuctor.");
		firstName = firstName1;
		lastName = lastName1;

	}

	public String getFirstName() {
		return firstName;

	}

	void walk() {
		System.out.println("I am walking...");
	}

	public String eat() {

		return "Sushi";

	}

	public static void main(String[] arg) {
		// Person person = new Person();//constructor.
		// person.getFirstName();
		Person person = new Person("Wan", "Siloojai");
		// person.firstName = "John";
		// person.lastName = "Don";
		// person.
	//	System.out.println("first name is :" + person.firstName);
		//System.out.println("last name is :" + person.lastName);
		person.walk();
		System.out.println("I eat :" + person.eat());

	}
}
