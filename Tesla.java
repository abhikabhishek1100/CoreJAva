package CoreJava;

 class Tesla extends Carn {
	 
	 @Override
	 void drive() {
		 System.out.println("Safely Drive");
	 }

	public static void main(String[] args) {
	// creating object
     Tesla t = new Tesla();
     t.drive();
     t.gearchange();
	}

}
