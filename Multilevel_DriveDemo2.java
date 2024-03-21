class BaseDemo{

	public void showBase(int a,int b){

		System.out.println("Show Base");
		int c = a+b;
		System.out.println("Addition="+c);
	
	}
}
class DriveDemo1 extends BaseDemo{

	public void showDrive1(int a,int b){
		System.out.println("showDrive1");
		int c = a-b;
		System.out.println("Subtraction="+c);
	}
}
class Multilevel_DriveDemo2 extends DriveDemo1{

	public void showDrive2(int a,int b){

		System.out.println("show Drive 2");
		int c = a*b;
		System.out.println("multiplication="+c);
	}

	public static void main(String[] args){
		
		int a = 10;
		int b = 5;

		Multilevel_DriveDemo2 multilevel_DriveDemo2 = new Multilevel_DriveDemo2();
		multilevel_DriveDemo2.showDrive2(a,b);
		multilevel_DriveDemo2.showDrive1(a,b);
		multilevel_DriveDemo2.showBase(a,b);
		
	}
} 