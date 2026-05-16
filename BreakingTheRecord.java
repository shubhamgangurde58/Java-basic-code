
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Result{

	public static List<Integer> breakingRecord(List<Integer> scores){

		int max = scores.get(0);
		int min = scores.get(0);
		
		int maxCount = 0;
		int minCount = 0;

		for(int i = 1 ; i < scores.size() ; i ++){
		
			if(scores.get(i) > max){
				max = scores.get(i);
				maxCount++;				
			}
			else if(scores.get(i) < min){
				min = scores.get(i);
				minCount++;
			}
		}
		
		return Arrays.asList(maxCount,minCount);
	} 

}

class BreakingTheRecord{

	public static void main(String args[]){

		List<Integer> scores = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Total Record : ");
		int n = sc.nextInt();

		System.out.println("Enter the Element : ");
		for(int i = 0 ; i < n ; i ++){
			
			int ele = sc.nextInt();
			scores.add(ele);
		}

		List<Integer> list = Result.breakingRecord(scores);
		System.out.println();

		for(int ele : list){
			System.out.print(ele+" ");
		}	
	}

}