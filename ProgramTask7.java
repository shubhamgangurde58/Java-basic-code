
import java.util.ArrayList;
import java.util.Collections;


// 7.Write a Java programto implement arraylist with function to add,remove & sort member
class ProgramTask7{

    public static void main(String args[]){

        ArrayList<Integer>  list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);

        System.out.println("ArrayList: " + list);

        System.out.println("Removing element at index 2: " + list.remove(2));

        System.out.println("ArrayList after removal: " + list);

        Collections.sort(list);

        System.out.println("Sorted ArrayList: " + list);

        
        
}

}