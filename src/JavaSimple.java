
public class JavaSimple {
public static void main(String []arg)

{

	boolean bln = true;
	byte b= 0x20;
	short s = 500;
	int i = 1000000;
	int j = 0x3FA0B3;
	char c ='A';
	char tab ='\t';
	int k = 07777;
	float f = 1.5f;
	long l = 2000000L;
	double pi = 3.14159265389793;
	double large = 1.3e100;
	//System.out.println("Hello World!!!");
	//System.out.println(bln);
	//System.out.println(b);
	//System.out.println(s);
	//System.out.println(i);
	//System.out.println(j);
	//System.out.println(c);
	//System.out.println(tab);
	//System.out.println(k);
	//System.out.println(f);
	//System.out.println(l);
	//System.out.println(pi);
	//System.out.println(large);
	String FName="Uthaiwan";
	String LName ="Siloodjai";
	String Nick = "wan";
	int age = 23;

	System.out.println(FName+'\t'+LName+'\n');
	System.out.println("Nick name is : "+Nick+'\n');
	System.out.println("Age : "+ age+'\n');
	System.out.println("********************"+'\n');
	System.out.println("Welcome to Java world"+'\n');

	System.out.println("************************");
	
	int[] intValue = new int[5];
	intValue[0]=5;
	intValue[1]=4;
	intValue[2]=3;
	intValue[3]=2;
	intValue[4]=1;
	//intValue[5]=6;
	
	System.out.println("intValue[0]"+intValue[0]);
	System.out.println("intValue[1]"+intValue[1]);
	System.out.println("intValue[2]"+intValue[2]);
	System.out.println("intValue[3]"+intValue[3]);
	System.out.println("intValue[4]"+intValue[4]);
	System.out.println("************************");

	int[] intArrays = {5,4,3,2,1};
	System.out.println("intArrays[0]"+intArrays[0]);
	System.out.println("intArrays[1]"+intArrays[1]);
	System.out.println("intArrays[2]"+intArrays[2]);
	System.out.println("intArrays[3]"+intArrays[3]);
	System.out.println("intArrays[4]"+intArrays[4]);
	
	int a =10;
	
	System.out.println(a);
	a++;
	a=a+1;
	a+=1;
	System.out.println(a);
	
	

}
}
