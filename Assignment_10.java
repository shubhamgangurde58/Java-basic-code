
import java.util.Random;


class MyThread extends Thread{

    String tname;

    public MyThread(String name){

        tname = name;

    }

    public void run(){

        Random rd = new Random();
        int time = rd.nextInt(5000);

        System.out.println("Created Thread : "+tname);

        try {

            System.out.println(tname + "  Sleeping for : " +time+ " ms");
            Thread.sleep(time);
            
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        System.out.println("Thread Dead : "+time);

    }

}

class Assignment_10{

    public static void main(String[] args) {
        
            MyThread t1 = new MyThread("Thread-1");
            MyThread t2 = new MyThread("Thread-2");
            MyThread t3 = new MyThread("Thread-3");

            t1.start();
            t2.start();
            t3.start();
            
    }

}