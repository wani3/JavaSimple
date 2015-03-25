package inheritance;

public class Human extends Life {

	public Human(){
		
		super("John");
		 System.out.println("The Human default constructor");
	
		
		
	}public Human(String name){
	
		super(name);
		 System.out.println("The Human default constructor whith string parametor");
	
		
		
	}
	
}
