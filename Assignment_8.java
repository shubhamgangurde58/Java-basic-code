
import java.util.Scanner;

class InvalidNameException extends Exception{

    public InvalidNameException(String msg) {

        super(msg);

    }

}
class Assignment_8{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    while(true){

        System.out.println("Enter the Name : ");
        String name = sc.next();

        try {
                if(name.length() == 0 || !name.matches("[a-zA-Z]+")){

                    throw new InvalidNameException("Name is Invalid");

                }else{  

                    System.out.println("Valid Name : "+name);
                }
   
        } catch(InvalidNameException e) {

                System.out.println(e.getMessage());

        }
        }
    }

}