
public class DoWhile {


	public static void main(String []arg)
	{
		String[] month = {"January","Febuary","March","April","May","June","July","August","September","October","November","December"};
		
		int counter =0;
		do{
			
			System.out.println(month[counter]);
			counter++;
			
		}while (counter < month.length);
		
		
	}


}
