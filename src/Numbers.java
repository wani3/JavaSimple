
public class Numbers {
public static void main(String[] arg) {
	double sum1 = 0;
	double sum2 = 0;

	/*	for (int counter = 1; counter <=100 ; counter++) {	
			sum+=counter;
			System.out.println("Sum: "+sum);	
		}System.out.println("Sum = "+sum);
		System.out.println("Avg = "+sum/100);
				
	}*/
int number[]= new int [100];
int num1=0,num2=0;
int i;
for(i=0;i<100;i++)
{
 number[i]=i+1;	
 //System.out.println(number[i]);
 if(number[i]%2==0){
	 num1++;
 }else //if(value%2==1)
	num2++;
}
for (int value : number) {
	if(value%2==0){
	 sum1+=value;
	}else //if(value%2==1)
	{
	sum2+=value;
		
	}
	} System.out.println("Sum1 = "+sum1);	
	System.out.println("Avg1 = "+sum1/num1);
	System.out.println("Sum2: "+sum2);	
	System.out.println("Avg2 = "+sum2/num2);
	//int n = number.length;
	//System.out.println(n);
}

}
