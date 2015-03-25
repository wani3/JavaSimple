public class PrimeNumber {
	public static void main(String[] arg) {
	
		int i,n=100,chk=0,j;
		/*
		for (i = 2; i < 100; i++){
		
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				
				System.out.println(i);
			}else if(i==1||i==2||i==3||i==5||i==7)
			{
				System.out.println(i);
				
			}
		}*/

		
		  
		  for (i = 2; i < n; i++) { 
			  chk = 0; 
			  for (j = 2; j < i; j++) {
				  if (i %j == 0) { 
					  chk = 1; 
					  break;
					  }
				  } if (chk == 0)
				  {  System.out.println(i); 
				  }
				  }
		  }
	}
		  
		
		  
		  
		  
	
			
			
		
			
		

	
