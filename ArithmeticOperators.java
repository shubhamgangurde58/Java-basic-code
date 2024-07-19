class ArithmeticOperators{

	public static int  addition(int a,int b){

		int c = a+b;
		return c;
	}
	
	public static int subtraction(int a,int b){

		int c = a-b;
		return c;
	}
		
	public static int  multiple(int a,int b){

		int c = a*b;
		return c;
	}
	
	public static int division(int a,int b){

		int c = a/b;
		return c;
	}
	public static int modules(int a,int b){

		int c = b%a;
		return c;
	}
	
	public static void main(String args[]){

		System.out.println("---Arithmetic Operators---");

		int a=10;
		int b=5;

		System.out.println("Addition="+ addition(a,b));
		System.out.println("\nSubtraction="+ subtraction(a,b));
		System.out.println("\nmultiple="+ multiple(a,b));
		System.out.println("\ndivision="+ division(a,b));
		System.out.println("\nModules="+ modules(a,b));

	}
}
