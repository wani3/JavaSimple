import java.util.Scanner;

public class ConvertWord {

	static void numTothai(int num) {

		if (num >= 1 && num <= 99999999) {
			String arrDigit[] = { " ", " หนึ่ง", " สอง", " สาม", " สี่",
					" ห้า", " หก", " เจ๊ด", " แปด", " เก้า" };

			int th5 = (num % 100000000) / 10000000;
			int th4 = (num % 10000000) / 1000000;
			int th3 = (num % 1000000) / 100000;
			int th2 = (num % 100000) / 10000;
			int th1 = (num % 10000) / 1000;
			int hu = (num % 1000) / 100;
			int te = (num % 100) / 10;
			int di = (num % 10);

			/*
			 * if (th5 > 0) { if (th5 == 2) { System.out.print(" ยี่สิบ "); }
			 * else if (th5 == 1) { System.out.print(" สิบ"); } else if (th5 >
			 * 2) { System.out.print(arrDigit[th5] + " สิบ "); } else
			 * if(th5==1&&th4==0){ System.out.print(" สิบล้าน ");
			 * 
			 * } }
			 */

			if (th5 > 0 && th4 == 1) {
				System.out.print(" เอ็ดล้าน ");
			} else if (th4 > 0) {
				System.out.print(arrDigit[th4] + " ล้าน ");
			}

			if (th3 > 0) {
				System.out.print(arrDigit[th3] + " แสน ");
			}
			if (th2 > 0) {
				System.out.print(arrDigit[th2] + " หมื่น ");
			}
			if (th1 > 0) {
				System.out.print(arrDigit[th1] + " พัน ");
			}
			if (hu > 0) {
				System.out.print(arrDigit[hu] + " ร้อย ");
			}
			if (te > 0) {
				if (te == 2) {
					System.out.print(" ยี่สิบ ");
				} else if (te == 1) {
					System.out.print(" สิบ ");
				} else if (te > 2) {
					System.out.print(arrDigit[te] + " สิบ ");
				}
			}
			if (te > 0 && di == 1) {
				System.out.print(" เอ็ด ");
			} else {
				System.out.print(arrDigit[di]);
			}
			if (di > 0 && te < 0 && hu < 0 && th1 < 0) {
				System.out.print(arrDigit[di]);
			}
		} else if (num == 0) {
			System.out.print("ศูนย์");
		} else {
			System.out.println("Enter number incorrect!!");
		}
	}

	static void numToeng(int num) {
		if (num >= 1 && num <= 9999999) {
			String arrDigit[] = { " ", " one", " two", " three", " four",
					" five", " six", " saven", " eight", " nine", "ten" };
			String arrNum1[] = { " ", "eleven", " twelve", " thirteen",
					" fourteen", " fifteen", " sixteen", " seventeen",
					" eighteen", " nineteen" };
			String arrNum[] = { " ", " ", " twenty", " thirty", " forty",
					" fifty", " sixty", " seventy", " eighty", " ninety" };

			int th5 = (num % 100000000) / 10000000;
			int th4 = (num % 10000000) / 1000000;
			int th3 = (num % 1000000) / 100000;
			int th2 = (num % 100000) / 10000;
			int th1 = (num % 10000) / 1000;
			int hu = (num % 1000) / 100;
			int te = (num % 100) / 10;
			int di = (num % 10);

			if (th4 > 0) {
				System.out.print(arrDigit[th4] + " million ");
			}

			if (th3 > 0) {
				System.out.print(arrDigit[th3] + " hundred ");
			}
			if (th2 > 0) {

				if (th2 > 0 && th2 == 1) {
					System.out.print(arrNum1[th2] + " thousand ");
				} else {
					System.out.print(arrNum[th2]);

				}
			}

			if (th1 > 0) {
				System.out.print(arrDigit[th1] + " thousand ");
			}

			if (hu > 0) {
				System.out.print(arrDigit[hu] + " hundred ");
			}
			if (te > 0) {
				if (te == 1 && di == 0) {
					System.out.print("ten");

				} else if (te == 1 && di > 0) {
					System.out.println(arrNum1[di]);
				}

				else {
					System.out.print(arrNum[te] + arrDigit[di]);
				}
			} else if (di > 0) {
				System.out.print(arrDigit[di]);
			}

		} else if (num == 0) {
			System.out.print("zero.");
		} else {
			System.out.println("Enter number incorrect!!");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter Number 1 - 9999999 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Input en / th : ");
		String lang = sc.next();
		switch (lang) {
		case "th":
			numTothai(num);
			break;
		case "en":
			numToeng(num);
			break;
		}

	}
}
