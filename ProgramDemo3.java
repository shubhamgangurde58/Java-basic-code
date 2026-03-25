
import java.util.Scanner;
import java.util.TreeSet;

class ProgramDemo3{

    public static void main(String[] args) {
        
            TreeSet<String> colours  = new TreeSet<>();
            Scanner sc  = new Scanner(System.in);

            System.out.println("Enter the Total Colours : ");
            int n = sc.nextInt();

            System.out.println("Enter the total Colours :");
            for (int i = 0; i < n; i++) {

                String col = sc.next();
                colours.add(col);

            }
            System.out.println("Colours : "+colours);

            sc. next();
    }

}