package inheritance;

public  class Rectangle extends Geometry {

	public Rectangle(double w1, double h1) {
		super(w1, h1);
		// TODO Auto-generated constructor stub
		this.getW();
		this.getH();
		System.out.println("constructor is Width rec : "+this.getW());
		System.out.println("constructor is Hight rec : "+this.getH());
	}

	void calRec() {
		double area = this.getH() * this.getW();
		setArea(area);
	}

}
