
public class ContinueStatement {
public static void main(String[] arg) {
		
		for (int counter = 1; counter <=10 ; counter++) {
			
			if(counter==5)
			{
				return;
				//continue;
				//break;
			}
			
			System.out.println(counter);
		}
	}
}
