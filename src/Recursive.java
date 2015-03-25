import java.util.Scanner;

public class Recursive {


	static String reCursive(String wd, int j) {
		
		char tmp;
		String str = "";
		if (j < 0) {

			return str;
		} else {
			tmp = wd.charAt(j);
			str += tmp;
			System.out.println(str);
			
			j--;

			return reCursive(wd,j);
		}

	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String wd = sc.nextLine();
		System.out.println(reCursive(wd,wd.length()-1));
	}

}
