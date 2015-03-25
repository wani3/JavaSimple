package innerClass;

public class Outer {

	private String thoughts = "My outer thoughts ";

	class Inner {
		String innerThoughts = "My inner thoughts";

		void doStuff() {

			System.out.println(innerThoughts);

			System.out.println(thoughts);

		}

	}

	static class Inner2 {
		String innerStr = "My inner2";

		void doStuff() {

			System.out.println(innerStr);

		}

	}

	public static void main(String[] args) {
		Outer o = new Outer();

		Outer.Inner i = o.new Inner();
		i.doStuff();

		Inner2 inner2 = new Outer.Inner2();
		inner2.doStuff();

	}

}
