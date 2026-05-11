// 12. LinkedList class and display them by using. a. Iterator Interface b. ListIterator Interface

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class ProgramTask9 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Shubham");
        list.add("Jayesh");
        list.add("Ritesh");

        System.out.println("Using Iterator Interface:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing ListIterator Interface:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Using ListIterator Interface in reverse:");
        ListIterator<String> reverseIterator = list.listIterator(list.size());
        while (reverseIterator.hasPrevious()) {
            System.err.println(reverseIterator.previous());
        }

    }
}