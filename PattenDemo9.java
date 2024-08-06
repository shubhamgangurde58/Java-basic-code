class PattenDemo9{
		
	public static void main(String args[]){

		System.out.println("");
	
		int n=5;
		int sum=0;

		for(int i=0;i<n;i++){

			for(int j=0;j<=i;j++){
		
				sum = i+j;

				if(sum % 2 == 0)
				{

					System.out.print("1");
					
				}else{

					System.out.print("0");
				}
			
			}
			System.out.println();
		}
	}
}