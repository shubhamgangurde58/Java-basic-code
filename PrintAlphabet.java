class PrintAlphabet{

	public static void main(String args[]){

		int alpha = 65;

		//Outer loop to handle row
		for(int i=0;i<=8;i++)
		{
			//inner loop to handle column
			for(int j=0;j<=i;j++)
			{
				//Print Alphabet
				System.out.print((char)(alpha + j)+" ");	
			}

			//Print new line after each row
			System.out.println();
		}
	}
}