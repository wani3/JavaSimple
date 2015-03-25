package has;

public class PersonTest {
	
	public static void main(String[] args) {
		Person person = new Person(null, null);
		person.setFirstName("wan");
		person.setLastName("Siloodjai");
		person.setAge(23);
		person.setGender("Female");

		Dog dog = person.getDog();
		dog.setName("doggy");
		dog.setColor("black");
		dog.setSex("male");
		dog.setSize("mini");
		person.setDog(dog);

		Cat cat = person.getCat();
		cat.setName("kittey");
		cat.setColor("blue");
		cat.setSex("Female");
		cat.setSize("big");
		person.setCat(cat);
		person.showPerson(person);
	
		
	}

}
