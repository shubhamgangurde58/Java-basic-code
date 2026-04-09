class MyThreadMessage implements  Runnable{

    private int n ;

    public MyThreadMessage(int n){

        this.n = n ;

    }

    public void run(){

        for(int i = 0 ; i < n  ; i ++){

            System.out.println("Hello Java..");

            try {
                
                Thread.sleep(1000);

            } catch (Exception e) {
            }
        }
    }
}

class Assignment_No2{

    public static void main(String[] args) {
        
        MyThreadMessage obj = new MyThreadMessage(10);

        Thread t1  = new Thread(obj);
        t1.start();

       // new Thread(new MyThreadMessage(10)).start();

    }

}