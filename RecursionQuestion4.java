class RecursionQuestion4{
	public static void printFibo(int a,int b,int n){

		if(n<=1){

			return ;
		}	
		int c = a+b;
		System.out.println(c);

		printFibo(b,c,n-1);
	}

	public static void main(String args[]){

		int a = 0;
		System.out.println(a);
		int b = 1;
		System.out.println(b);

		int n = 10;
		printFibo(a,b,n-2);

	}
}