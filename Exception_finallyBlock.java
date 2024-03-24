class Exception_finallyBlock{

	public static void main(String[] args){
		
		System.out.println("Program Start");
	
		int a = 10;
		int b = 0;
		int c = 0;
	   try{
		c = a/b;
		System.out.println("Division="+c);
	      }
	      catch(ArithmeticException e)
	      {
		System.out.println("Can`t Divided by Zero");
	      }
	      catch(ArrayIndexOutOfBoundsException s)
	      {
		System.out.println("Array index out of bound");
	      }
	      finally
	      {
  		System.out.println("Program ended");
	      }

	}
}