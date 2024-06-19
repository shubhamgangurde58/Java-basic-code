class PiramidPatten2{

	public static void main(String args[])
	{
		
		for(int i=0;i<5;i++)
		{
			int num=0;
			for(int j=5;j>=0;j--)
			{
				if(j<=i){
			
					System.out.print(num++);
				}
				System.out.print(" ");
				
			}
	
			System.out.println();
		}
	}
}