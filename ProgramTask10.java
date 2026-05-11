// 13. Write a program to calculate perimeter and area of rectangle. (hint : area = length * breadth ,perimeter=2*(length+breadth))

import java.util.Scanner;

class ProgramTask10{

    public static void main(String[] args) {

        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }

}