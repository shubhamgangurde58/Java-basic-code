class SwapingDemo{

	public static void main(String args[])
       	{
		int a=10;
		int b=20;
		System.out.println("Original value:");
		System.out.println("\nA="+a+"\nB="+b);
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println("After Swaping:");
		System.out.println("A="+a);
		System.out.println("B="+b);
	}
}