class BitwiseOperator{

    public static void main(String args[]){

        // BitwiseOperator 
        // Bitwise AND &,
        // Bitwise OR |,
        // Bitwise NOT ~,
        // Bitwise XOR ^,
        // Bitwise Left Shift <<,
        // Bitwise Rigth >>,
        // Unsigned rigth Shift >>>;

        int a = 5;
        int b = 7;

        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));


        int c = a&b;
        System.out.println("AND, & = "+c+"\t"+Integer.toBinaryString(c));

        int d = a|b;
        System.out.println("OR | = "+d+"\t"+Integer.toBinaryString(d));

        //int e = a~b;
        //System.out.println("NOT ~ = "+d+"\t"+Integer.toBinaryString(e));

        int f = a^b;
        System.out.println("XOR ^  = "+f+"\t"+Integer.toBinaryString(f));

        int g = a<<b;
        System.out.println("Rigth Shift Op << "+g+"\t"+Integer.toBinaryString(g));

        int h = a<<b;
        System.out.println("Left Shift Op << "+h+"\t"+Integer.toBinaryString(h));

        int i = a<<b;
        System.out.println("Unsigned Shift Op << "+i+"\t"+Integer.toBinaryString(i));

    }

}