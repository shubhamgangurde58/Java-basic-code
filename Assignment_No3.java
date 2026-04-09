
import java.util.Random;

class MyThreadClass extends Thread{

    String ThreadName;
    int SleepTime;

    public MyThreadClass(String name){

        ThreadName = name;

    }

    public void run(){

        Random r = new Random();

        try{

            int SleepTime = r.nextInt(5000);

            System.out.println("Thread Created : "+ ThreadName);
            System.out.println(ThreadName+" will Sleep for "+SleepTime+" ms ");

            Thread.sleep(SleepTime);
            

            System.out.println(ThreadName+ " is Dead ! ");


        }catch(Exception e){

        }
    }
}

class Assignment_No3{

    public static void main(String[] args) {
        
            MyThreadClass t1 = new MyThreadClass("Thread - 1");
            MyThreadClass t2 = new MyThreadClass("Thread - 2");
            MyThreadClass t3 = new MyThreadClass("Thread - 3");

            t1.start();
            t2.start();
            t3.start();

    }
} 