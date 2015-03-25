import java.util.Scanner;

public class ReCharacter {
	public static void main(String[] arg) {

		/*int i = 0, j;
		char msg[] = { 'H', 'E', 'L', 'L', 'O' };
		char msg1;
		int n = msg.length - 1;
		for (i = 0, j = n; i < j; i++, j--) {
			char buf[] = new char[n - i];
			msg1 = msg[i];
			msg[i] = msg[j];
			msg[j] = msg1;
			System.out.println(msg);

		}*///String word = "HELLO";
		Scanner word = new Scanner(System.in);
		String wd = word.nextLine();
		int j=wd.length()-1;
		for(int i=j;i>=0;i--){
			System.out.print(wd.charAt(i));
			
		}

	}

}
