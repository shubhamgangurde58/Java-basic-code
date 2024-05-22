

import java.util.Scanner;

public class DrvingLicense {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter the Age:");
        age = sc.nextInt();

        try {
            if(age<18) {
                throw new AgeException("Please Provide Legal Age");
            }
        } catch (AgeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
