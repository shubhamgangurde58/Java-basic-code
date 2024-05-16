interface MyInterface{
	int a=10;

	void fun1();
	void fun2();
}

class Myclass implements MyInterface{
	public void fun1(){
		System.out.println("this is fun1");
	}
	
	public void fun2(){
		System.out.println("this is fun2");
	}
	
}
 
class InterfaceObjectDemo{
	public static void main(String args[])
	{ 
		MyInterface obj = new Myclass();
		
		obj.fun1();
		obj.fun2();
	} 
}
