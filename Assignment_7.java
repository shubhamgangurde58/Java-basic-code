import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class Assignment_7{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Hashtable<String , Double> ht = new Hashtable<>();

        System.out.println("Enter the Number of Employee : ");
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i ++){

            System.out.println("Enter the Name : ");
            String name = sc.next();

            System.out.println("Enter the Salary : ");
            double salary = sc.nextDouble();

            ht.put(name, salary);

        }

        double max = 0;

        for(double sal : ht.values()){

            if(sal > max){
                max = sal;
            }

        }

        System.out.println("Employee With Maximum Salary : ");

        Set<String>  keys = ht.keySet();

        for(String key : keys){

            if(ht.get(key) == max){

                System.out.println(key+" -> "+max);
            }
        }
    }
}