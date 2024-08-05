class PattenDemo6{

	public static void main(String args[]){

		System.out.println("---- Half Pyramid in Number----");
		
		int n=4;

		for(int i=0;i<=n;i++){

		
			for(int j=0;j<=n;j++){

				if(i>=j){
					
					System.out.print(j+1);
				}
				
				//System.out.print(" ");
			}

			System.out.println();
		}

	}
		
}