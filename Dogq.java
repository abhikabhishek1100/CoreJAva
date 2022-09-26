package CoreJava;

 class Dogq extends Mammal {
// methods of dogs
	 public void sound() {
		 System.out.println("I bark");
	 }
	 public static void main(String[] args) {
		// creating a object
		 Dogq d = new Dogq();
		 // calling the methods
		 d.eat();
		 d.nature();
		 d.sound();
		 
	}
}
