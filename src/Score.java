import java.util.Scanner;

public class Score {
	public static void main(String[] arg) {
		
		Scanner score = new Scanner (System.in);
        int sc = score.nextInt();  

		switch (sc / 10) {
		case 10:
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
			
		case 6:
			System.out.println("D");
			break;
		default:
			
				System.out.println("F");
		}
  
	}

}
