class Sample extends Thread{
	
	void show() throws InterruptedException{
		for(int i=0;i<10;i++)
		{
			System.out.println(" Thred Message");
			sleep(3000);
		}
	}
}

class ThreadDemo{

	public static void main(String args[]) throws InterruptedException
	{
		
		Sample sample = new Sample();
		sample.show();
	}
}