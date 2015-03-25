package inheritance;

public class Trigle extends Geometry {

	public Trigle(double w1, double h1) {
		super(w1, h1);
		
		this.getW();
		this.getH();
		System.out.println("constructor is Width tri : "+this.getW());
		System.out.println("constructor is Hight tri : "+this.getH());
		// TODO Auto-generated constructor stub

	}

	void calTri() {
		double area = 0.5 * this.getH() * this.getW();
		setArea(area);
	}

	//@Override
	//void name() {
		// TODO Auto-generated method stub
		
	//}


}
