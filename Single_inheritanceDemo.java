class BaseDemo{

	public void showBase(int a,int b){

		System.out.println("Show Base");
		int c = a+b;
		System.out.println("Addition="+c);
	
	}
}
class Single_inheritanceDemo extends BaseDemo{

	public void showDrive(int a,int b){
		System.out.println("showDrive1");
		int c = a-b;
		System.out.println("Subtraction="+c);
	}

	public static void main(String args[]){	
		
		int a=10;
		int b=20; 
		Single_inheritanceDemo obj = new Single_inheritanceDemo();
		obj.showBase(a,b);
		obj.showDrive(a,b);
	}
}

