class PattenDemo3{

	public static void main(String args[]){

		System.out.println("----Half Pyramid----");

		for(int i=0;i<=4;i++){

			for(int j=0;j<=5;j++){

				if(i>j)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
		
}