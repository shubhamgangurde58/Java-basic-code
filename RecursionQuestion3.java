class RecursionQuestion3{

	public static int printFactorial(int n){

		if(n == 0 || n == 1){
	
			return 1;
		}
		
		int fact  = printFactorial(n-1);
			
		int factorial = n * fact;

		return factorial;
		
	}

	public static void main(String args[]){

		System.out.println("Print the sum of n natural number");

		int n = 5;
		int fact = 1;

		int a = printFactorial(n);
		System.out.println("Factorial of n="+a);
	}
}