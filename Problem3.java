import java.util.Scanner;
class Problem3{

	public static int bigNumber(int a,int b){

		if(a>b)
		{
			return a;
		}else{

			return b;
		}
		
	}
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(bigNumber(a,b)+" is Greater number of those");
	}
	
}