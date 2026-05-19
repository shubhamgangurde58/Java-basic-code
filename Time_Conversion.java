import java.util.Scanner;

class Result{
	
	public static String timeConversion(String str){

		String hours = str.substring(0,2);
		String period = str.substring(8,10);
		String rest = str.substring(2,8);

		int hr = Integer.parseInt(hours);
	
		if(period.equals("AM")){
			if(hr == 12){
			    hr = 0;
			}
		}
		else{
			if(hr != 12){
			  hr += 12;
			}
		}		
		return String.format("%02d",hr)+rest;
	}
	
}
class Time_Conversion{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 12 hr time in String (HH:MM:SSPM/AM) formate : ");

		String str = sc.next();

		String rs = Result.timeConversion(str);

		System.out.println(rs);	
	}
}