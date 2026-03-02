import java.util.Scanner;
class StringDemo1{

	public static void main(String args[]){

		//String define

		String fname ="shubham";
		String lname = "Gangurde";

		//String print

		System.out.println(fname + " " + lname);

		//String length()

		System.out.println(fname.length() + " " +lname.length());

		System.out.println(fname + " " + lname);

		//User input String 

		Scanner sc = new Scanner(System.in);
							
		System.out.println("Enter the String:");
		fname = sc.next();

		System.out.println(fname + " " + lname);

		//String concat()

		System.out.println(fname.concat(lname));

		//String charAt()

		for(int i=0;i<fname.length();i++){

			System.out.println(fname.charAt(i));
			
		}

		//String Compaire

		if(fname.equals(lname)){

			System.out.println("Both String are same");
		}else
		{
			System.out.println("Both String are NOT same");
		}
	}
}