
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class ProgramDemo6{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> SA =  new HashSet<>();
        Set<Integer> SB = new HashSet<>();

        System.out.println("Enter the Total Number o Elements of SA : "); 
        int na = sc.nextInt();

        System.out.println("Enter the element : ");
        for(int i = 0 ; i < na ; i ++){
            int ele = sc.nextInt();
            SA.add(ele);
        }

        System.out.println("Enter the Total Number of Elements of SB : ");
        int nb = sc.nextInt();

        for(int i = 0 ; i < nb ; i++){
            int ele = sc.nextInt();
            SB.add(ele);
        }

        System.out.println("Operation on Set : ");

        Set<Integer> u  = new HashSet<>(SA);
        u.addAll(SB);
        System.out.println("Union (A U B) : "+u);

        Set<Integer> i = new HashSet<>(SA);
        i.retainAll(SB);
        System.out.println("Intersection (A n B) : "+i);

        Set<Integer> ca = new HashSet<>(SA);
        ca.removeAll(SB);
        System.out.println("Complement (A - B) : "+ca);

        Set<Integer>  cb  = new HashSet<>(SB);
        cb.removeAll(SA);
        System.out.println("Compliment (B - A) : "+cb);

    }
}