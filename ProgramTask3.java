// 3.Write a function using lambda expression to calculate power of number.(xy)

@FunctionalInterface
interface Power {
    double calculate(double x, double y);
}

class ProgramTask3 {

    public static void main(String[] args) {

        Power power = (x, y) -> Math.pow(x, y);
        double result = power.calculate(2, 3);
        System.out.println("Power: " + result);


    }
}