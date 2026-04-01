
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Assignment_5{

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            ArrayList<String> list = new ArrayList<>();

            System.out.println("Enter the Number of Student : ");
            int n = sc.nextInt();


            System.out.println("Enter the Name : ");
            for(int i = 0 ; i < n ; i ++){

                String name = sc.next();

                if(list.contains(name)){

                    System.out.println("Duplicate Name not allowed ! ");
                    i--;

                }else{

                    list.add(name);

                }   
            }

            Collections.sort(list);

            System.out.println("\nStudent Name in Assending Order : ");

            for(String name : list){

                System.out.println(name);

            }


    }

}