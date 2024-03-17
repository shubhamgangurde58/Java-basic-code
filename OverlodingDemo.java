class OverlodingDemo{
	
	public void add(int a,int b){
	 
	 int c = a+b;
	System.out.println(c);
	}

	public void add(double x,double y){

	 double c = x+y;
	 System.out.println(c);
	}
	
	public void add(int a,double x){
	double c = a+x;
	System.out.println(c);
	}
	public static void main(String[] args){
	
	OverlodingDemo overlodingDemo = new OverlodingDemo(); 
	
	int a = 10;
	int b = 20;
	double x = 5.1;
	double y = 8.2;

	 overlodingDemo.add(a,b);
	 overlodingDemo.add(x,y);
	 overlodingDemo.add(a,x);

	}
}