class BaseDemo{

	public void showBase(int a,int b){

		System.out.println("Show Base");
		int c = a+b;
		System.out.println("Addition="+c);
	
	}
}
class Single_DriveDemo extends BaseDemo{

	public void showDrive(int a,int b){

		System.out.println("show Drive");
		int c = a-b;
		System.out.println("Suntraction="+c);
	}
	public static void main(String[] args){
		
		int a = 10;
		int b = 5;
		Single_DriveDemo single_DriveDemo = new Single_DriveDemo();
		single_DriveDemo.showDrive(a,b);
		single_DriveDemo.showBase(a,b);
	}
} 