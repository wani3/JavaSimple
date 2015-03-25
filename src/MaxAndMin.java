public class MaxAndMin {
	public static void main(String[] args) {
		int[] number = { 20, 3, 4, 25, 10, 15, 2 , 30};
		int max = number[0];
		
		int min = number[0];
		for (int i = 1; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
	  		} else if (number[i] < min) {
				min = number[i];
			}
		}System.out.println("Max is = "+max);
		 System.out.println("Min is = "+min);

	}
}
