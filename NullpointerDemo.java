
import java.util.Scanner;
class NullpointerDemo {

	public static void main(String args[]){
	
		String name = null;
		

		try{
			System.out.println("length="+name.length());

		 } catch (Exception ex) 
			{
				System.out.println("please Enter The Name:");
			}
	}
}