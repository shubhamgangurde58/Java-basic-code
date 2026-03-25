
import java.util.ArrayList;
import java.util.Scanner;

class ProgramDemo1{

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            ArrayList<String> cities = new ArrayList<String>();

            System.out.println("Enter the Total Cities : ");
            int n = sc.nextInt();

            System.out.println("Enter the Cities : ");
            for(int i = 0 ; i < n ; i ++){

                String city = sc.next();
                cities.add(city);

            }
            System.out.println("The Cities : "+cities);
            for(String city : cities){

                System.out.println(city + " ");

            }

            cities.clear();
            sc.close();
    }

}