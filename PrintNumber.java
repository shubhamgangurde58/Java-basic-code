class PrintNumber{

	public static void main(String args[]){

		

		//Outer loop to handle row
		for(int i=0;i<=8;i++)
		{
			//inner loop to handle column
			for(int j=0;j<=i;j++)
			{
				//Print Number
				System.out.print(j+" ");	
			}

			//Print new line after each row
			System.out.println();
		}
	}
}