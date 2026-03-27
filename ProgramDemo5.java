
import java.util.Scanner;
import java.util.TreeSet;

class ProgramDemo5{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        TreeSet<Object> ts = new TreeSet<>();

        System.out.println("Enter the total Number : "); 
        int n = sc.nextInt();

        System.out.println("Enter the number : ");
        for(int i = 0 ; i < n ; i ++){
            int num = sc.nextInt();
            ts.add(num);
        }

        System.out.println(ts);
        sc.close();

    }

}