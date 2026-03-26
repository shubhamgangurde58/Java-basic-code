import java.util.Scanner;

class ProgramDemo6 {

    public void sumOfDiagonal(int r , int c , int sum , int arr[][]){

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == j) {
                    sum = sum +  arr[i][j];
                }
            }
        }
        System.out.println("Sum of diagonal elements = " + sum);

    }

    public void sumOfUpperDaigonal(int r , int c , int sum , int arr[][]){

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i < j) {
                    sum = sum + arr[i][j];
                }
            }
        }
        System.out.println("Sum of upper diagonal elements = " + sum);

    }

    public void sumOfLowerDaigonal(int r , int c , int sum , int arr[][]){

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i > j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of lower diagonal elements = " + sum);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProgramDemo6 obj = new ProgramDemo6();

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int choice;
        do {
            System.out.println("\n**** Menu *****\n");
            System.out.println("1. Sum of diagonal elements : ");
            System.out.println("2. Sum of upper diagonal elements : ");
            System.out.println("3. Sum of lower diagonal elements : ");
            System.out.println("4. Exit : ");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            int sum = 0;

            switch (choice) {
                case 1:
                    obj.sumOfDiagonal(r , c , sum , arr);
                    break;

                case 2:
                    obj.sumOfUpperDaigonal(r , c , sum , arr);
                    break;

                case 3:
                    obj.sumOfLowerDaigonal(r , c , sum , arr);
                    break;

                case 4:
                    System.exit(0);
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        }while(choice != 4);
    }
}