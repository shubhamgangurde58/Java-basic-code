class BaseDemo{
	public void add(int a,int b){
		
		int c = a+b;
		System.out.println("Addition="+c);
	}
}
class DriveDemo extends BaseDemo{
	
	public void add(int a,int b){

		super.add(a,b);
		int c = a-b;
		
		System.out.println("Subtraction="+c);
	}
}
class SuperkeywardDemo{

	public static void main(String[] args){
		int a = 25;
		int b = 20;
		DriveDemo drivedemo = new DriveDemo();
		drivedemo.add(a,b);
	}
}