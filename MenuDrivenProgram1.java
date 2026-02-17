
import java.util.Scanner;

class MenuDrivenProgram1{

    public void VolumnOfCylinder(Scanner sc){

        System.out.println("Enter a Radius : ");
        double radius = sc.nextInt();

        System.out.println("Enter a Height : ");
        double height = sc.nextInt();

        double volume = 3.14 * radius * radius * height ;
        System.out.println("Volume Of Cylinder : "+volume);

    }

    public void factorialCalc(Scanner sc){

        System.out.println("Enter a any Number : ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i = 1; i<= num ; i++){

            fact = fact * i;
        }

        System.out.println("Factorial = "+fact);

    }

    public void checkAmstrong(Scanner sc){

            System.out.println("Enter the any Number : ");
            int num = sc.nextInt();

            int temp = num ;

            int reminder ;

            int sum = 0;


            while(num != 0){

                    reminder  = num % 10;
                    sum = sum + (reminder * reminder * reminder );
                    num = num / 10;
                

            }

            if(temp == sum){
                System.out.println("Number is Amstrong ");
            }else{
                System.out.println("Number is not Amstrong ");
            }

    }


    public static void main(String args[]){

        System.out.println("\n\n*** Welcome to Menu Driven Program ***\n\n");
        Scanner sc = new Scanner(System.in);
        
        int  a = 1;
        int choice ;

        MenuDrivenProgram1 obj = new MenuDrivenProgram1();


        do{

            System.out.println("**** Menu ****");
            System.out.println("\n 1. Calculate the Valumn of Cylinder  \n 2. Calculate the Factorial  \n 3. Check Amstrong Number  \n 4. Exit  \n Enter your Choice : ");
            choice = sc.nextInt();

               switch (choice) {

                    case 1 :
                        obj.VolumnOfCylinder(sc);
                       break;
                    case 2 :
                        obj.factorialCalc(sc);
                       break;
                    case 3 :
                        obj.checkAmstrong(sc);
                       break;
                    case 4 :
                        System.out.println("Program Successfully Exited ! :");
                        System.exit(0);
                       break;

                   default:
                        System.out.println("! Invalid Input / Try again ");

               }
                System.out.println("To Continue Enter the (1/yes) (0/No) : ");
                a = sc.nextInt();

        }while(a == 1);

        System.out.println("Program Successfully Exited !");
        
    }
}