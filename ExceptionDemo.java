class ExceptionDemo{
	public static void main(String[] args){
		
		int a = 10;
		int b = 0;
		System.out.println("starting program");
		
		try{
			int c = a/b;
			System.out.println("Division="+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can not Divided by Zero");
		}
		System.out.println("program ended");
	}
}