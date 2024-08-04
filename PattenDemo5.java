class PattenDemo5{

	public static void main(String args[]){

		System.out.println("----Inverted Half Pyramid----");
		System.out.println("----Rotated by 180 degree");

		int n=4;

		for(int i=0;i<=n;i++){

		
			for(int j=0;j<=n-i;j++){
				
				System.out.print(" ");
				
			}
			for(int j=0;j<=i;j++){

				System.out.print("*");
			}

			System.out.println();
		}

	}
		
}