
public class TypeConversion {
public static void main(String []arg)
{
	int  integer1 =10;
	long longImplcitValue = integer1;
	
	System.out.println("integer1 : "+integer1);
	System.out.println("longImplcitValue : "+longImplcitValue);
	
	short long1 = 1;
	int integerExplicitValue =(short)long1;
	System.out.println("integerExplicitValue : "+integerExplicitValue);
	
	float long2 = 3333.5f;
	int integerExplicitValue2 =(int)long2;
	System.out.println("integerExplicitValue : "+integerExplicitValue2);
	
	int long3 = 100;
	double integerExplicitValue3 =(double)long3;
	System.out.println("integerExplicitValue : "+integerExplicitValue3);

	long l1 = 1000l;
	float f1 = (float)1.0;
	System.out.println("integerExplicitValue : "+integerExplicitValue);
	char c1 ='A';
	int in1=c1;
	

}
}
