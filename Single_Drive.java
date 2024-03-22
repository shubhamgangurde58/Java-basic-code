class BaseDemo{
	
	public void add(int a,int b){
	
		int c = a + b;
		System.out.println("Addition="+c);
	}
}
class Single_Drive extends BaseDemo{
	
	public static void main(String[] args){
	
		int a = 10;
		int b = 20;
		Single_Drive single_drive = new Single_Drive();

		single_drive.add(a,b);
	}
}