class Exception_Arrayindex{

	public static void main(String[] args){

		int[] a = new int[2];
		a[0] = 10;
		a[1] = 20;
		System.out.println("starting program");
		for(int i=0;i<3;i++)
		{
		   try{
			System.out.println(a[i]);
		      }
		      catch(ArrayIndexOutOfBoundsException e)
		     {
			System.out.println("can not given the array element");
		     }
 	
		}
		System.out.println("program ended");
	}
}	