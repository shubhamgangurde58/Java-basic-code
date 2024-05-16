interface MyInterface3{

	void fun1();
	void fun2();
	
	default void fun3(){
		System.out.println("this is fun3");
	}
	
	default void fun4(){
		System.out.println("this is fun4");
	}
}

class InterfaceMethodeDemo{
	public static void main(String args[])
	{ 
		MyInterface3 obj = new MyInterface3(){
		public void fun1(){
		System.out.println("this is fun1");
		}
		public void fun2(){
		System.out.println("this is fun2");
		}};
		
		obj.fun1();
		obj.fun2();
		obj.fun3();
		obj.fun4();
	} 
}
