// File: DataTypesDemo.java
public class DataTypesDemo {
    public static void main(String[] args) {
        
        // ====== Primitive Data Types ======
        
        // 1. Integer types
        byte b = 100;             // 1 byte
        short s = 20000;          // 2 bytes
        int i = 500000;           // 4 bytes
        long l = 9876543210L;     // 8 bytes (use 'L' for long values)

        // 2. Floating point types
        float f = 12.34f;         // 4 bytes (use 'f' for float)
        double d = 1234.5678;     // 8 bytes

        // 3. Character type
        char c = 'A';             // 2 bytes (stores Unicode character)

        // 4. Boolean type
        boolean flag = true;      // 1 bit (true/false)

        // ====== Constants ======
        final double PI = 3.14159;   // constant value (cannot be changed)
        final int MAX_USERS = 100;   // another constant

        // ====== Display output ======
        System.out.println("===== Data Types, Variables & Constants Demo =====");
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + flag);
        System.out.println("Constant PI: " + PI);
        System.out.println("Constant MAX_USERS: " + MAX_USERS);

        // Example of using variables
        int radius = 5;
        double area = PI * radius * radius;   // Using constant PI
        System.out.println("Area of Circle (r=5): " + area);
    }
}
