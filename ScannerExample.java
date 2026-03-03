import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        // Displaying output
        System.out.println("\n***** User Details *****");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

        sc.close(); // Close scanner
    }
}
