
import java.util.LinkedList;
import java.util.Scanner;

class ProgramDemo2{

    public static void main(String[] args) {
        
            LinkedList<String> friends = new LinkedList<>();
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Total Friends : ");
            int n = sc.nextInt();

            System.out.println("Enter the friend : ");
            for(int i = 0 ; i < n ; i ++){

                String f = sc.next();
                friends.add(f);

            }
            System.out.println("Friends : "+friends);
            sc.close();
    }

}