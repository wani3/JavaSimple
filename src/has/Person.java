package has;

public class Person {
	private Dog dog;
	private Cat cat;
	private String firstName;
	private String lastName;
	private String gender;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private Person() {			///ไม่ใช้  default Constructor
		this.dog = new Dog();
		this.cat = new Cat();
	}
	public Person(Dog dog,Cat cat){
		this.dog = new Dog();
		this.cat = new Cat();
		
	}

	Dog getDog() {
		return dog;
	}

	void setDog(Dog dog) {
		this.dog = dog;
	}

	Cat getCat() {
		return cat;
	}

	void setCat(Cat cat) {
		this.cat = cat;
	}

	public void showPerson(Person person) {
		
		System.out.println("Person FirstName :  " + person.getFirstName());
		System.out.println("Person Color : " + person.getLastName());
		System.out.println("Person Age : " + person.getAge());
		System.out.println("Person Gender : " + person.getGender());
		System.out.println("*********************");
		dog.showDog(dog);
		System.out.println("*********************");
		cat.showCat(cat);
	

	}
	

}
