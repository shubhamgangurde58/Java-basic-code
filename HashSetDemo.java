

import java.util.HashSet;
import java.util.Iterator;

class HashSetDemo {

    public static void main(String[] args) {

        System.out.println("Welcome to HashSet Demo" );
        HashSet<Integer> set = new HashSet<>();

        //Inserting element
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(100);
        set.add(200);
        System.out.println(set);

        //Deleting element
        set.remove(50);
        System.out.println(set);

        //Searching element
        System.out.println(set.contains(20));
        System.out.println(set.contains(40));
        System.out.println(set);

        //Iteration
        for (Integer integer : set) {
            System.out.print(integer + ",");
        }
        System.out.println();

        //isEmpty
        if(!set.isEmpty())
        {
            System.out.println("Set is not Empty:");
        }

    }
}
