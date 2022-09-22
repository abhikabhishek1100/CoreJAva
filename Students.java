package CoreJava;
class Students extends Teacher{
	 // method of students
	public void Listen(){
	System.out.println("Listening to the teacher");
	}
	public static void main(String[] args){
	Students S = new Students();
	S.teach();
	S.Listen();
	}
	}
