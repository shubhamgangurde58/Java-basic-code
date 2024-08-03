class RelationalOperators{

	public static boolean dobbleEqualTo(int a,int b){

		return a==b;
	}
	public static boolean notEqualTo(int a,int b){

		return a!=b;
	}
	public static boolean lessthanEqualTo(int a,int b){

		return a<=b;
	}
	public static boolean greaterthanEqualTo(int a,int b){

		return a>=b;
	}
	
	public static void main(String args[]){

		System.out.println("---Relational Operators---");
		int a=10;
		int b=5;

		System.out.println("\nDobbleEqualTo="+dobbleEqualTo(a,b));
		System.out.println("\nNotEqualTo="+notEqualTo(a,b));
		System.out.println("\nlessthanEqualTo="+lessthanEqualTo(a,b));
		System.out.println("\ngreaterthanEqualTo="+greaterthanEqualTo(a,b));
		

	}
}