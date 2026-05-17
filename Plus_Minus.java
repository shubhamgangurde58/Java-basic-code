
import java.util.Scanner;
import java.util.ArrayList;

class Result{

	public static void plusMinus(ArrayList<Integer> list){

		int positive = 0 ;
		int negative = 0 ;
		int zero = 0 ; 
		int totalEle = list.size();

		for(int ele : list){
		
			if(ele > 0){
				positive++;
			}
			if(ele < 0){
				negative++;
			}
			if(ele == 0){
				zero++;
			}
		
		}

		double posiRatio = (double) positive / totalEle;
		double negaRatio = (double) negative / totalEle;
		double zeroRatio = (double) zero / totalEle;

		System.out.printf("%.6f\n",posiRatio);
		
		System.out.printf("%.6f\n",negaRatio);
		
		System.out.printf("%.6f\n",zeroRatio);
		 
	}	
}

class Plus_Minus{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>(); 
		
		System.out.println("Enter the 6 Element : ");

		for(int i = 0 ; i < 6 ; i ++){

			int ele = sc.nextInt();

			list.add(ele);
		}
	
		Result.plusMinus(list);
	}
}