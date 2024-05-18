interface Interface1{
	void fun1();
	
	default void fun2(){
		System.out.println("This is Fun2 of interface1");
	}
	
	static void fun3(){
		System.out.println("This is fun3 of interface1");
	}
}

interface Interface2{
	void fun1();
}

class InterfaceDemo1 implements Interface1 {
	
	@Override
	public void fun1(){
		System.out.println("This is Fun1");
	}

	@Override
	public void fun2(){
		System.out.println("This is Fun2 of class");
		Interface1.super.fun2();
	}


	public static void main(String args[])
	{
		InterfaceDemo1 obj = new InterfaceDemo1();
		obj.fun1();	

		obj.fun2();

		Interface1.fun3();
	}
}