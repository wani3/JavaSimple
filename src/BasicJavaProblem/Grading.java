package BasicJavaProblem;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	 System.out.println("Input Score : ");
	int score = sc.nextInt();
	System.out.println("Input Mid : ");
	int mid = sc.nextInt();
	System.out.println("Input Final : ");
	int finals = sc.nextInt();
	
	int sum = score + mid + finals;
	if(sum>=80&&sum<=100){
		System.out.println("A");
	}else if(sum>=75&&sum<=79){
		System.out.println("B+");	
	}else if(sum>=70&&sum<=74){
		System.out.println("B");	
	}else if(sum>=65&&sum<=69){
		System.out.println("C+");	
	}else if(sum>=60&&sum<=64){
		System.out.println("C");	
	}else if(sum>=55&&sum<=59){
		System.out.println("D+");	
	}else if(sum>=50&&sum<=54){
		System.out.println("D");	
	}else if(sum>=0&&sum<=49){
		System.out.println("F");	
	}

	
}
}
