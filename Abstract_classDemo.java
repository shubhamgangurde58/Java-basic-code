
abstract class Bike{

	abstract void run();
}
class Abstract_classDemo extends Bike{
	
	void run(){

		System.out.println("runing Safely");
	}
	public static void main(String args[])
	{
		Abstract_classDemo ac = new Abstract_classDemo();
		ac.run();
	}
}
