
import java.util.Random;

class NumberGenerate extends Thread{

    public void run(){

        Random r = new Random();

        while(true){

            int num = r.nextInt(100);

            if(num % 2 == 0){

                    SquereThread s1 = new SquereThread(num);
                    s1.start();

            }else{

                    CubeThread c1 = new CubeThread(num);
                    c1.start();

            }
            
            try {

                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

}

class SquereThread extends Thread{

    int num ;

    public SquereThread(int num) {
        this.num = num;
    }

    public void run(){

        System.out.println("Number : "+num + "  Squere of Number -> : "+(num * num));

    }
}

class CubeThread extends Thread{

    int num ;

    public CubeThread(int num ){

        this.num = num;

    }

    public void run(){

        System.out.println("Number : "+ num + "  Cube of number -> : " +(num * num * num));

    }
}


class  Assignment_4{

    public static void main(String[] args) {
        
        NumberGenerate t1 = new NumberGenerate();
        t1.start();

    }

}