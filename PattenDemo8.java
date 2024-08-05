class PattenDemo8{

	public static void main(String args[]){

		System.out.println("-----Floyd's Triangle----");

		int n=4;
		int num =1;
		for(int i=0;i<=n;i++){

		
			for(int j=0;j<=n;j++){

				if(i>=j)
				{
					System.out.print(num++ +" ");
				} 
				
			}

			
			System.out.println();
		}

	}
		
}