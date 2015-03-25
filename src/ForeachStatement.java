public class ForeachStatement {
	public static void main(String[] arg) {

		int[] numbers = { 1, 2, 3, 4, 5 };
		for (int value : numbers) {
			if(value>3)break;
			System.out.println(value);

		}

	}
}
