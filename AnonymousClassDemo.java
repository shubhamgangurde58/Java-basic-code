interface MyInterface2{
	int a=10;

	void fun1();
	void fun2();
}


 
class AnonymousClassDemo{
	public static void main(String args[])
	{ 
		MyInterface2 obj = new MyInterface2(){
		public void fun1(){
		System.out.println("this is fun1");
		}
		public void fun2(){
		System.out.println("this is fun2");
		}};
		
		obj.fun1();
		obj.fun2();
	} 
}
