class RecursionQuestion7{
	
	public static void towerOfHanoi(int n , String src , String help , String dest){
	
		if(n == 1){

			System.out.println("tranfer disk " + n + "  form  " + src + "  to  " + dest );
			return;
		}
		
		towerOfHanoi(n-1, src , dest , help);

		System.out.println("tranfer disk " + n + "  form  " + src + "  to  " + dest );

		towerOfHanoi(n-1, help , src , dest);
	}

	public static void main(String args[]){

		int n = 3;

		towerOfHanoi(n , "S" , "H" , "D");
		
	}
}