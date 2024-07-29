class RecursionQuestion5{

	public static int calcPower(int x , int n){

		if(n == 0){

			return 1;
		}
		if(x == 0){

			return 0;
		}

		int powerof = calcPower(x,n-1);
		int power = powerof * x;
		
		return power;
		
	}

	public static void main(String args[]){

		int x = 2 ;
		int n = 5;

		int ans = calcPower(x , n);

		System.out.println("Power of x ="+ans);
		
	}
}