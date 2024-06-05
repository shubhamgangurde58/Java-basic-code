
interface Calc {

    int add(int a,int b);
}

public class functionalInterface2 {

    public static void main(String[] args) {
        Calc obj = (a,b) -> a+b;
        int c = obj.add(5,9);
        System.out.println("Add="+c);
    }
}
