
import java.util.Scanner;

class MyThread extends Thread {

    String str;

    MyThread(String str){

        this.str = str ;

    }
    public void run(){

         System.out.println("Vowels in the string are:");

        for(int i = 0 ; i < str.length() ; i ++){

            char ch = str.charAt(i);
        
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
             ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                System.out.print(ch + " ");
            }
        }
    }
}


class Assignment_No1{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        MyThread my = new MyThread(str);
        my.start();

    }

}