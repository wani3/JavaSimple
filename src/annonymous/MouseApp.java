package annonymous;

public class MouseApp {
	public static void main(String[] args) {
		Mouse mouse = new Mouse();
		mouse.click();

		Mouse mouseAnnonymous = new Mouse() {
			public void click() {

				System.out.println("I am click mouse...");

			}

		};

		mouseAnnonymous.click();

		// List list = new List();
		DoubleClick doubleClick = new DoubleClick() {
			
			public void doubleClick() {
				System.out.println("I am double click...");

			}

		};
		doubleClick.doubleClick();
		
		DoubleClickImplement dc = new DoubleClickImplement();
		dc.doubleClick();
		
		
		
		
	}

}

abstract class DoubleClick {

	abstract  public void doubleClick();

}

class DoubleClickImplement extends  DoubleClick {

	@Override
	public void doubleClick() {
		// TODO Auto-generated method stub
		System.out.println("Do double click...");
	}

}



	











