
import java.util.Hashtable;
import java.util.Scanner;

class Contact{

    String name ;
    String phoneNo;

    public Contact(String name , String phoneNo){

        this.name = name;
        this.phoneNo = phoneNo;

    }

    @Override
    public String toString(){
        return "name : "+name +" ,phoneNo : " + phoneNo;
    }

}

public class ProgramDemo4{

    public static void main(String[] args) {
        
        Hashtable<String , Contact> hashtable = new Hashtable<>(); 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total contact : ");
        int n = sc.nextInt();

        for(int i = 1 ; i < n ; i ++){
            System.out.println("Enter the Name : ");
            String name = sc.next();
            System.out.println("Enter the Contact : ");
            String phoneNo = sc.next();

            hashtable.put(name , new Contact(name, phoneNo));
        }

        System.out.println("Contacts in this hashtable : ");
        System.out.println(hashtable);

    }

}