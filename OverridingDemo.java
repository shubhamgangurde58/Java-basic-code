class BaseDemo{

	public void add(int a,int b){

	int c = a+b;
	System.out.println("Addition="+c);

	}
}	

class OverridingDemo extends BaseDemo {
	
	public void add(int a,int b){
		
	int c =a-b;
	System.out.println("Subtraction="+c);
	}
	
	public static void main(String[] args){
		int a = 30;
		int b = 10;
		
	
		OverridingDemo overridingDemo = new OverridingDemo();
		overridingDemo.add(a,b);

		BaseDemo basedemo =new BaseDemo();
		basedemo.add(a,b);
	}
}