
interface Calc {

    int add(int a,int b);
}

public class LambdaExpression2 {

    public static void main(String[] args) {
        Calc obj = (a,b) -> a+b;
        int c = obj.add(15,9);
        System.out.println("Add="+c);
    }
}
