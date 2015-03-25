package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitTest {
	public static void main(String[] args) {
		Fruit fruit = new Fruit(null, null);

		ArrayList<Fruit> fruit1 = new ArrayList<Fruit>();

		// Fruit apple = new Apple();
		// apple.setName("apple");
		//apple.setColor("Red");
		//fruit.add(apple);
		fruit1.add(new Apple("Apple", "Red"));
		fruit1.add(new Banana("Banana", "yellow"));
		fruit1.add(new Papaya("Papaya", "green"));
		fruit1.add(new Orange("Orange", "orange"));

		// /for(int i = 0;i<fruit1.size();i++){
		//
		// Fruit fruits = fruit1.get(i);
		// System.out.println(fruits.getName()+" "+fruits.getColor());
		//
		// }
		for (Fruit fruits : fruit1) {
			System.out.println(fruits.getName() + " " + fruits.getColor());
		}

	}

}
