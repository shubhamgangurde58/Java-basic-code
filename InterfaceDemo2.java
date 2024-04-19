interface SampleInterface
{
	void add(int a,int b);
	void sub(int a,int b);	
}
 class Sample implements SampleInterface
{
	
	public void add(int a,int b){
		System.out.println("This is Add function");
		int c=a+b;
		System.out.println("Addition="+c);
	}
	
	public void sub(int a,int b){
		System.out.println("This is sub function");
		int c=a-b;
		System.out.println("Subtraction="+c);
	}
}

class InterfaceDemo2
{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		Sample sample =new Sample();
		sample.add(a,b);
		sample.sub(a,b);
	}
}