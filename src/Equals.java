
public class Equals {
	public static void main(String[] arg) {
		String[] month = { "January", "Febuary", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };
	
	String str1 = new String("A");
	String str2 = new String("A");
	
	String s = "A";
	System.out.println(str1==str2);
	System.out.println(str1.equals(str2));
	System.out.println(s.equals(str2));
	
	
	if(str1.equals(str2)){
		
		System.out.println("equals.");
	}else 
	{
		System.out.println("not equals.");	
		
	}
	for(String value : month){
		if(value.equals("August")){
			System.out.println(value);
			
		}
		
		
	}
	for (int i= 0;i<month.length;i++){
		
		String value = month[i];
		
		if(value.equals("August"));
		
	}

	}
}
