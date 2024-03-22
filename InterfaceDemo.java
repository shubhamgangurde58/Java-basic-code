
interface Operation{

	void add(int a,int b);
	void sub(int a,int b);
}

class BaseDemo implements Operation {
	public void add(int a,int b){
	
		int c = a + b;
		System.out.println("Addition="+c);
	}
	public void sub(int a,int b){
		int c = a-b;
		System.out.println("Subtraction="+c);
	}
}
class InterfaceDemo extends BaseDemo{

	public static void main(String[] args){
				
		int a=10;
		int b=20;

		InterfaceDemo interfaceDemo = new InterfaceDemo();

		interfaceDemo.add(a,b);
		interfaceDemo.sub(a,b);
	}
}