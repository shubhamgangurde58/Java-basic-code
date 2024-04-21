
import student.*;
class Result extends Studentinfo{

	void output(){
			
		System.out.println("Student Id="+id);
		System.out.println("Student name="+name);
	}
	public static void main(String args[]){
		Result result = new Result(); 
		result.input();
		result.output();
	}
}