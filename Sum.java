package CoreJava;

 class Sum {
// creating method sum(int x, int y)
	 public int sum (int x, int y) {
		 return (x+y);
	 }
	 //creating method sum (intx, inty , intz)
	 public int sum (int x , int y , int z) {
		 return(x+y+z);
	 }
	 //creating method sum (double,double)
	 public double sum(double x , double y) {
		 return(x+y);
	 }
	 public static void main(String[] args) {
		Sum s = new Sum();
		System.out.println(s.sum(1,2));
		System.out.println(s.sum(1,2,3));
		System.out.println(s.sum(15.2,22.2));
	}
}
