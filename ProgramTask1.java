
// 1. Define a class calculation to implement method overloading for addition of two integers and two double
// variables

class Calculation{

    public void add(int a ,int b){

        int c = a+b;
        System.out.println("The Addition is : "+c);

    }

    public void add(double a , double b){

        double c = a+b;
        System.out.println("The Addition is : "+c);

    }
}

class ProgramTask1{

    public static void main(String args[]){

        Calculation obj = new Calculation();

        obj.add(10,20);
        obj.add(10.02 ,15.03);
    }
}