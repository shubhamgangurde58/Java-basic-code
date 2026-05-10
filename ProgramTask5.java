// Create a thread to display even numbers between 1 to 500 each number will display after 3 seconds.

class MyThread extends Thread{

    public void run(){

        for(int i = 0 ; i < 500 ; i ++){

            if (i%2 == 0) {
                System.out.println("Even Number : "+i);
            }

            try {

                Thread.sleep(100);
                
            } catch (Exception e) {

                System.out.println("Exception : "+e);

            }

        }

    }

}

class ProgramTask5 {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        t1.start();
    }
}