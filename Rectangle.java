class Rectangle{
	
	private int length;
	private int weigth;

	Rectangle(int x, int y){
	  
	length = x;
	weigth = y;

	}

	public void area(){
	
	int a =  length * weigth;
	System.out.println("Rectangle area ="+a);

	}

	public static void main(String[] args){

	  int x;
	  int y;

	Rectangle rectangle = new Rectangle(10,20);
	rectangle.area();
	}
}