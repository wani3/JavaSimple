import java.util.Scanner;

public class pNum {

	public static void main(String[] arg) {

		/*
		 * int i, j, n = 100, chk;
		 * 
		 * for (i = 2; i < n; i++) { chk = 0; for (j = 2; j < i; j++) { if (i %
		 * j == 0) { chk = 1; break; } } if (chk == 0) {
		 * 
		 * System.out.println(i); }
		 * 
		 * }
		 */int num1;
		for (num1 = 2; num1 <= 97; num1++) {
			int i = 2, prime = 1;
			while (i < num1 && prime == 1) {
				if (num1 % i == 0)
					prime = 0;
				else
					i++;
			}
			if (prime == 1)
				System.out.println(num1);
		}

	}

}
// }

