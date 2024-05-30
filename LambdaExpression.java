
interface MyInterface{

	int add(int a,int b);
}
class LambdaExpression{

	public static void main(String args[])
	{
		MyInterface obj =(a,b)-> a+b;

		int sum = obj.add(10,20);
		System.out.println("Add="+sum);
	}
}