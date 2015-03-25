package oop;

import java.util.Scanner;

public class Atm {
	int num = 0;
	double money = 1000;
	int pw ;
	//int count = 0;
	
	public Atm(double money1) {
		// TODO Auto-generated constructor stub
		//money = money1;

	}

	void dePosit(double money) {
		this.money += money;

	}

	void withDrawal(double money) {

		if (this.money < money) {
			System.out.println("Balance is less.");

		} else {

			this.money -= money;

		}

	}

	public double getBalance() {

		return money;

	}

	public int logIn(int id,int count) {

		if (id == 1234) {
			if(count==1){
			System.out.println("Welcome!!!");
			
			}return pw = 1;
		} else {
			//System.out.println(count);
			System.out.println("Try again!!");
			return pw = 0;
		}
	

	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		boolean chk = true;
		double money = 0;
		//int pw = 0;

		int count = 1;
		Atm atm = new Atm(money);
		
		System.out.println("Input password : ");
		
		int pass = sc.nextInt();
		
		//atm.logIn(pass);
			
		while (chk) {
	
		
			//System.out.println(pass);
			if (atm.logIn(pass,count) == 1) {
				//System.out.println(count);
				count++;
				///chk = false;
				System.out.println("Please Enter Number" + '\n'
						+ "Press number 1 : Deposit " + '\n'
						+ "Press number 2 : Withdrawal " + '\n'
						+ "Press number 3 : Balance " + '\n'
						+ "Press number 4 : Exit");

				int num = sc.nextInt();
				//chk = false;
				switch (num) {

				case 1:

					System.out.println("Deposit : ");
					money = sc.nextDouble();
					atm.dePosit(money);
					break;

				case 2:

					System.out.println("Withdrawal : ");
					money = sc.nextDouble();
					atm.withDrawal(money);
					break;

				case 3:
					System.out.println("Balance : " + atm.getBalance());
					break;
				case 4:
					chk = false;
					System.out.println("Exit.");
					break;

				}
			}else {
				System.out.println("Input password : ");
				 pass = sc.nextInt();
			}
			
		}
	}

}
