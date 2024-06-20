
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add elements

        list.add(100);
        list.add(90);
        list.add(80);
        list.add(50);

        System.out.println(list);

        //Get element

        System.out.println(list.get(1));

        //add element between

        list.add(1,20);
        System.out.println(list);

        //deleted element
        list.remove(4);
        System.out.println(list);

        //loop on list
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting the element

        Collections.sort(list);
        System.out.println(list);

    }

}
