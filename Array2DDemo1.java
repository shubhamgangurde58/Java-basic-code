import java.util.Scanner;
class Array2DDemo1{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of rows");
		int row = sc.nextInt();
		System.out.println("Enter the columns");
		int column = sc.nextInt();

		int[][] array = new int[row][column];

		System.out.println("Enter the element:");
		for(int i=0;i<row;i++){
 
			for(int j=0;j<column;j++){

				 array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("-----------------");


		for(int i=0;i<row;i++){
 
			for(int j=0;j<column;j++){

				 System.out.println(array[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("--print first row:---");


		System.out.println(array[0][0]);
		System.out.println(array[0][1]);
		System.out.println(array[0][2]);
		System.out.println(array[0][3]);
	
		System.out.println("---print first column----");

		System.out.println(array[0][0]);
		System.out.println(array[1][0]);
		System.out.println(array[2][0]);


	}
}