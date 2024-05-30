
interface MyInterface{

	int add(int a,int b);
}
class FunctionalInterface{

	public static void main(String args[])
	{
		MyInterface obj = new MyInterface(){

			public int add(int a,int b){
				
				return a+b;
			}	
		};

		int sum = obj.add(10,20);
		System.out.println("Add="+sum);
	}
}