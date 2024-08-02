class RecursionAdvanced21{

	public static int callGuests(int n){

		if( n <= 0){

			return 1;
		}
		
		
		int ways1 = callGuests(n-1);

		
		int ways2 = (n-1) * callGuests(n-2);

		return ways1 + ways2;
		
	}

	public static void main(String args[]){

		int n = 5;

		System.out.println(callGuests(n));
		
	}
}