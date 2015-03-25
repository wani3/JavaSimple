package inheritance;

public class Geometry {

	private double w;
	private double h;
	private double area;

	public Geometry(double w1, double h1) {

		w = w1;
		h = h1;
		// this.setW(w1);
		// this.setH(h1);

	}
	//abstract void calTri();
	//abstract void name();   


	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	/*
	 * double multi(double w1, double h1){ double multi = w1 * h1; return multi;
	 * 
	 * }
	 */

}
