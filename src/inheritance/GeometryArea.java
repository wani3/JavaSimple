package inheritance;

import java.util.Scanner;

public class GeometryArea {
	public static void main(String arg[]) {

		/*
		 * Scanner sc = new Scanner(System.in); double w = sc.nextInt(); double
		 * h = sc.nextInt();
		 */
		// double w = 5;
		// double h = 3;
		Trigle tri = new Trigle(3, 5);
		Rectangle rec = new Rectangle(10, 12);
		System.out.println("Width Trigle : " + tri.getW());
		System.out.println("Hight Trigle : " + tri.getH());
		tri.calTri();
		System.out.println("Area Trigle = " + tri.getArea());
		rec.calRec();
		System.out.println("Width Rectangle : " + rec.getW());
		System.out.println("Hight Rectangle : " + rec.getH());
		System.out.println("Area Rectangle = " + rec.getArea());
	}
}
