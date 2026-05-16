import java.util.Scanner;

class Result{
	
	public static int divisiblesumpairs(int n , int k , int arr[]){
	
		int count = 0 ; 

		for(int i = 0 ; i < n ; i ++){

			for(int j = i+1 ; j < n ; j++ ){

				if((arr[i] + arr[j]) % k == 0){

					count++;
					System.out.println("["+arr[i]+","+arr[j]+"]");
				}
			}
		}

		return count;


	}

}

class DivisibleSumPairs{

	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Value of N : ");
		int n = sc.nextInt();

		System.out.println("Enter the Value of k :");
		int k = sc.nextInt();

		int arr[] = new int[n];
        
		System.out.println("Enter the Array elements : ");
        	for(int i = 0; i < n; i++) {

           		 arr[i] = sc.nextInt();

        	}

		int count = Result.divisiblesumpairs(n,k,arr);	

		System.out.println("Total Pairs : "+count);
	}
}