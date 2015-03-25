package oop;

import java.util.Scanner;

public class Calculator {
	static int num1;
	static int num2;
	static String ca;
//char add = '+';
//char minus ='-';
//char multi = '*';
//char divide = '/';

public Calculator(int numb1, String cal1, int numb2) {
	// TODO Auto-generated constructor stub
	num1=numb1;
	ca=cal1;
	num2=numb2;
}
void add(int num1,int num2){
	//System.out.println("add = "+(numb1+numb2));
	int sum=0;
	sum=num1+num2;
	System.out.println("add = "+sum);

}void minus(int num1,int num2){
	//System.out.println("add = "+(numb1+numb2));
	int minus=0;
	minus=num1-num2;
	System.out.println("minus = "+minus);
}
void multip(int num1,int num2){
	//System.out.println("add = "+(numb1+numb2));
	int mul=0;
	mul=num1*num2;
	System.out.println("multi = "+mul);
}void divide(int num1,int num2){
	//System.out.println("add = "+(numb1+numb2));
	int div=0;
	div=num1/num2;
	System.out.println("div = "+div);

	
}public static int getAdd(){
	return num1+num2;
	
	
}public static int getMinus(){
	return num1-num2;
	
}public static int getMulti(){
	return num1*num2;
	
}public static int getDiv(){
	return num1/num2;
	
}

public Calculator() {
	// TODO Auto-generated constructor stub
}
public static void main(String []arg){
	//Calculator cal = new Calculator();
	Scanner num = new Scanner(System.in);
	System.out.println("Input x : ");
	num1 = num.nextInt();
	System.out.println("Input Operator : ");
	Scanner calcu = new Scanner(System.in);
	ca = calcu.next();
	System.out.println("Input y : ");
	num2 = num.nextInt();
	Calculator cal1 = new Calculator(num1,ca,num2);

	switch (ca)
	{
	case "+":	System.out.println("Calculator : "+Calculator.getAdd());break;
	case "-":   System.out.println("Calculator : "+Calculator.getMinus());break;
	case "*":   System.out.println("Calculator : "+Calculator.getMulti());break;
	case "/":   System.out.println("Calculator : "+Calculator.getDiv());break;
	default:
		
		System.out.println("Incorrect.");
	}
	//System.out.println("Calculator : "+Calculator.getMinus());
	//System.out.println("Calculator : "+Calculator.getMulti());
	//System.out.println("Calculator : "+Calculator.getDiv());

}}
