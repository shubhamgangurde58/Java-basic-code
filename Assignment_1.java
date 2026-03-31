
import java.util.Scanner;

abstract class Shape
{
    abstract void area();
    abstract void volume();
}

class Cone extends Shape
{
    double r;
    double h;
    double l;
    double pi = 3.14;

    Cone(double r, double h, double l)
    {
        this.r = r;
        this.h = h;
        this.l = l;  
    }

    void area()
    {
        double area = pi * r * (r + l);
        System.out.println("Cone Area = " + area);
    }

    void volume()
    {
        double volume = (1.0/3) * pi * r * r * h;
        System.out.println("Cone Volume = " + volume);
    }
}

class Cylinder extends Shape
{
    double r;
    double h;
    double pi = 3.14;

    Cylinder(double r, double h)
    {
        this.r = r;
        this.h = h;
    }

    void area()
    {
        double area = 2 * pi * r * (r + h);
        System.out.println("Cylinder Area = " + area);
    }

    void volume()
    {
        double volume = pi * r * r * h;
        System.out.println("Cylinder Volume = " + volume);
    }
}

class Assignment_1
{
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of cone:");
        double r1 = sc.nextDouble();

        System.out.println("Enter height of cone:");
        double h1 = sc.nextDouble();

        System.out.println("Enter slant height of cone:");
        double l1 = sc.nextDouble();
        
        Cone c = new Cone(r1, h1, l1);
        c.area();
        c.volume();

        System.out.println();

        System.out.println("Enter radius of cylinder:");
        double r2 = sc.nextDouble();

        System.out.println("Enter height of cylinder:");
        double h2 = sc.nextDouble();
       
        Cylinder cy = new Cylinder(r2, h2);
        cy.area();
        cy.volume();
    }
}