
import java.util.LinkedList;
import java.util.Scanner;

class LinkedListDemo {

    Node head;
    int size;
    public LinkedListDemo() {
        size=0;
    }
   public class Node{

        String data ;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    public  void addFirst(){
        Node newNode = new Node(head.data);
        newNode.next=head;
        head = newNode;
    }

    public void addLast(){
        Node newNode = new Node(head.data);

        if(head == null){
            head = newNode;
            return;
        }

        Node lastNode = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }

        lastNode.next = newNode;
    }

    public  void printList(){
        Node currNode = head;

        while(currNode !=null){
            System.out.println(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("Empty list , Nothing  to Deleted");

            return;
        }
        head = this.head.next;
        size--;

    }
public void removeLast(){
        if(head == null){
            System.out.println("Empty List ,nothing  to Deleted:");

            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null)
        {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;

}

//public void addInMiddel(int index , String data){
//        if(index > size || index == 0){
//            System.out.println("Invalid index value:");
//            return;
//        }
//        size++;
//
//        Node newNode = new Node(data);
//        if(head == null || index == 0){
//
//            newNode.next = head;
//
//            head = newNode;
//            return;
//        }
//
//        Node currNode = head;
//        for(int i=0;i<size;i++)
//        {
//            if(i == index){
//
//                Node nextNode = currNode.next;
//                currNode.next = newNode;
//                newNode.next = nextNode;
//                break;
//            }
//            currNode = currNode.next;
//        }
//}

public int getSize(){
      return size  ;
}

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Scanner scanner  = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1.addNode \n2.addFirst \n3.addLast \n4.removeFirst \n5.removeLast \n6.displayList\n7.Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the String data:");
                    String data = scanner.next();
                    list.add(data);
                    break;
                case 2:
                    System.out.println("Enter the String data:");
                    String firstData = scanner.next();;
                    list.addFirst(firstData);
                    break;
                case 3:
                    System.out.println("Enter the String data:");
                    String lastData = scanner.next();;
                    list.addLast(lastData);
                    break;
                case 4:
                        list.removeFirst();
                    break;
                case 5:
                        list.removeLast();
                    break;
                case 6:
                    System.out.println(list);
                    break;
            }
        } while(choice<=6);

//        //insert element
//        list.add("is");
//        list.add("a");
//        System.out.println(list);
//
//        //addNew element using method
//        list.addLast("List");
//        list.addFirst("This");
//        System.out.println(list);
//
//        //searching element
//        System.out.println(list.get(0));
//        System.out.println(list.size());
//
//        //remove element
//      //  list.remove(2);
//       //list.removeFirst();
//       //list.removeLast();
//        System.out.println(list);
//
//        //add in Middle element using index
//        list.add(3,"Linked");
//        System.out.println(list);


    }
}
