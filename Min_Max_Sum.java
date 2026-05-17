import java.util.Scanner;

class Result{
	
	public static void minMaxSum(int arr[]){
	
		int minValue = arr[0];
		int maxValue = arr[0];
		long totalSum = 0;

		for(int value : arr){

			totalSum += value;
	
			if(value < minValue){
				minValue = value;
			}
			if(value > maxValue){
				maxValue = value;
			}
		}
		long maxSum = totalSum - minValue;
		long minSum = totalSum - maxValue;
		System.out.println(minSum+" "+maxSum);
	}

}

class Min_Max_Sum{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);	

		int arr[] = new int[5];

		System.out.println("Enter the 5 Element : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();	
		}
		
		Result.minMaxSum(arr);
		sc.close();	
	}

}