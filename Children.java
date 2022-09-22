package CoreJava;
class Children extends Father{
	 public void Naughty(){
	System.out.println("Little bit naughty");
	}
	public static void main(String args[]){
	Children obj = new Children();
	obj.Anger();
	obj.Nature();
	obj.Naughty();
	}
	}