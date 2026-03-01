
import java.util.Scanner;

class ReverseArrayDemo{

    public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the array Size : ");
            int size = sc.nextInt();

            int myArray[] = new int[size];

            System.out.println("Enter the element : ");
            for(int i = 0; i < size;i++){

                    myArray[i] = sc.nextInt();

            }

            System.out.println("Actual Array element : ");
            System.out.print("[ ");

            for(int i = 0;i < size; i++){   

                System.out.print(myArray[i]+",");

            }
            System.out.print(" ]");


            System.out.println("\n\nReverse Array element : ");
            System.out.print("[ ");

            for(int i = size-1;i >= 0; i--){   

                System.out.print(myArray[i]+",");

            }
            System.out.print(" ]");

    }

}