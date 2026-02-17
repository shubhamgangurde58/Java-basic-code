
import java.util.Scanner;

class AreaOfRectangle{

    public double  width ;
    public double  height;
    public double  area;
    public double  para;

    public void getInput(){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the width Of Rectangle : ");
            width = sc.nextInt();

            System.out.println("Enter the height of Rectangle : ");
            height = sc.nextInt();        

    }

    public void AreaCalc(){

            area = height * width;

            para = 2 * (height + width);

    }

    public void display(){

            System.out.println("Area Of Rectangle : "+area);
            System.out.println("Parameter of Rectangle : "+para);

    }

    public static void main(String args[]){

            AreaOfRectangle obj = new  AreaOfRectangle();
            obj.getInput();
            obj.AreaCalc();
            obj.display();

    }

}