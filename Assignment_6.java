
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class Assignment_6{

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            LinkedList<String> list =  new LinkedList<>();

            System.out.println("\nEnter the Number of Employee : ");
            int n = sc.nextInt();

            System.out.println("\nEnter the Name : ");
            for(int i = 0 ; i < n ; i ++){

                String name = sc.next();
                list.add(name);

            }

            System.out.println("\nUsing Iterator : ");
            Iterator<String> it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }

            System.out.println("\nUsing ListIterator : Forword ");
            ListIterator<String> lit = list.listIterator();
            while(lit.hasNext()){
                System.out.println(lit.next());
            }

            System.out.println("\nUsing ListIterator : Backword ");
            while(lit.hasPrevious()){
                System.out.println(lit.previous());
            }

    }

}