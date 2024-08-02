class RecursionAdvanced20{

	public static int placeTiles(int n,int m){

		if( n == m){

			return 2;
		}
		
		if( n < m){
			
			return 1;
		}

		// vertical placement
		int vertPlacement = placeTiles(n-m,m);

		// horigental placement
		int horPlacement = placeTiles(n-1,m);

		return vertPlacement + horPlacement;
		
	}

	public static void main(String args[]){

		int n = 2;
		int m = 4;

		int totalplace = placeTiles(n,m);

		System.out.println("Total Placement ="+totalplace);
		
	}
}