
public class Grade {
public static void main(String []arg)
{

	int score=80 ;
	//Scanner score =new Scanner(system.in);
	if(score>=90&&score<=100)
	{
		System.out.println("A");	
	}else if(score>=80&&score<=89)
	{
		System.out.println("B");
	}else if(score>=70&&score<=79)
	{
		System.out.println("C");
	}else if(score>=50&&score<=69)
	{
		System.out.println("D");
	}else if(score<50)
	{
		System.out.println("F");
	}

}
}
