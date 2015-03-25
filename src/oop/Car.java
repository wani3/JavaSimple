package oop;

import java.util.Scanner;

public class Car {
	String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public void setOil(String oil) {
		this.oil = oil;
	}
	String color; 
	int wheel;
	String oil;
	private String name;
	public Car(){
		
		brand = "Toyota";
		color = "Black";
		wheel = 4;
		oil = "Full";
	}
public Car(String brand1, String color1, int wheel1, String oil1) {
		// TODO Auto-generated constructor stub
	this.brand=brand1;
	color = color1;
	wheel =wheel1;
	oil = oil1;
	}
void stop(){
	System.out.println("Stop car.");
}
void run(){
	System.out.println("Run car.");

}
public String getOil(){
	return oil;

}
public String getColor(){
	return color;
	
	
}
public int getWheel(){
return wheel;

}
public String getBrandCar(){
	return brand;
	
	
}

public static void main(String arg[]){
	Car car = new Car();
	Car car1 = new Car("Toyota","Black",4,"Full");
	//System.out.println("Car-Brand:");

	//Scanner brand = new Scanner(System.in);
//	String brand1 = brand.nextLine();
	//System.out.println("Car :"+car.stop());
	//System.out.println("Car :"+car.oil(oil1));
	System.out.println("Car-Brand: "+car.getBrandCar());
	System.out.println("Car-Color: "+car.getColor());
	System.out.println("Car-Oil: "+car.getOil());
	System.out.println("Car-Wheel: "+car.getWheel());
	car.setColor("Red");
	car.setColor("Red");
	car.stop();
	car.run();
}
private void setColor(String string) {
	// TODO Auto-generated method stub
	
}
public void setName(String name)
{
 this.name = name;	
}public String getName(){
	return this.name;
	
	
}

}