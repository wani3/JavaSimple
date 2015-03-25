package has;

public class Cat extends Animal {
	
	public void showCat(Cat cat) {
		System.out.println("Cat Name : " + cat.getName());
		System.out.println("Cat Color : " + cat.getColor());
		System.out.println("Cat Sex : " + cat.getSex());
		System.out.println("Cat Size : " + cat.getSize());
		cat.breath();
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("Cat breath.");

	}

}
