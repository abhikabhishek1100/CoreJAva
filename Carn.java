package CoreJava;

abstract class Carn {
//creating constructor
	public Carn() {
		System.out.println("Car is bulit");
	}
	
	abstract void drive();
	// method
	public void gearchange() {
		System.out.println("Change gear");
	}
}
