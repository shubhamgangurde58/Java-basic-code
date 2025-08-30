class BreakANDcontinueDemo{

	public static void main(String args[]){

		int number = 50;
	
		for(int i = 1;i<=number ;i++){

			if(i == 37){
				System.out.println("👉 Break applied at " + i + " (loop yaha terminate ho gaya)");
				break;
			}
			if(i % 5 == 0){
				System.out.println("👉 Continue applied, skipped number: " + i);
				continue;
			}
			System.out.println(i);		

		}
		
	}

}