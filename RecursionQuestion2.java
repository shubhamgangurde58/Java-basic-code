class RecursionQuestion2{

	public static void printSum(int i,int n,int sum){

		if(i > n){
	
			System.out.println("Sum of n="+sum);
			return ;
		}

		sum += i;
		
		System.out.println("i = "+i);
		printSum(i+1,n,sum);

		
		
	}

	public static void main(String args[]){

		System.out.println("Print the sum of n natural number");

		int i = 1;
		int n = 5;
		int sum = 0;

		printSum(i,n,sum);
	}
}