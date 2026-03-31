
import java.util.Scanner;

interface Shape{
    void area();
}

class Circle implements Shape{

    double r; 
    final double pi = 3.14;

    Circle(double r){

        this.r = r;

    }

    public void area(){
        
        double area = pi * (r * r);
        System.out.println("Area of Circle : "+area);

    }

}

class Sphere implements Shape{

    double r;
    final double  pi = 3.14;

    Sphere(double r){
        this.r = r ;
    }
    
    public void area(){

        double area = pi * (r * r);
        System.out.println("Surface Area of Sphere : "+area);

    }
}

public class Assignment_2{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius of Circle : ");
        double cr = sc.nextDouble();

        Circle cobj = new Circle(cr);
        cobj.area();

        System.out.println("Enter the Radius of Sphere : ");
        double sr = sc.nextDouble();

        Sphere sobj = new Sphere(sr);
        sobj.area();

    }

}