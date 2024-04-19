class BaseDemo{
	void add(int a,int b){
		System.out.println("\nThis is Base class");
		int c=a+b;
		System.out.println("Addition="+c);
	}
}

class DriveDemo1 extends BaseDemo{
	void sub(int a,int b){
		System.out.println("\nThis is DriveDemo1 class");
		int c=a-b;
		System.out.println("Subtraction="+c);
	}
}

class DriveDemo2 extends BaseDemo{
	void multi(int a,int b){
		System.out.println("\nThis is DriveDemo2 class");
		int c=a*b;
		System.out.println("multiplication="+c);
	}
}
class Hierarchical_Demo{
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		DriveDemo1 obj1 = new DriveDemo1();
		obj1.add(a,b);
		obj1.sub(a,b);

		System.out.println("--------------------------");
		DriveDemo2 obj2 = new DriveDemo2();
		obj2.add(a,b);
		obj2.multi(a,b);		
	}
}