
import java.util.Scanner;

class MyThread extends Thread{

    String str ;

    public MyThread(String str) {
    
        this.str = str;

    }

    public void run(){

        System.out.println("Vowels are : ");

        for(int i = 0 ; i < str.length() ; i ++){

                char ch = str.charAt(i);

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

                    System.out.print(ch+"  ");

                }

        }

    }

}

class Assignment_9{

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the String : ");
            String str = sc.next();

            MyThread obj = new MyThread(str);
            obj.start();

    }

}