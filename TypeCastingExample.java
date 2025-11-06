public class TypeCastingExample {
    public static void main(String[] args) {

        // ***** Implicit Type Casting (Widening) *****
        int numInt = 100;
        double numDouble = numInt; // int to double automatically

        System.out.println("***** Implicit Type Casting *****");
        System.out.println("Integer value: " + numInt);
        System.out.println("Converted to double: " + numDouble);

        // ***** Explicit Type Casting (Narrowing) *****
        double decimalValue = 99.99;
        int intValue = (int) decimalValue; // double to int (manual cast)

        System.out.println("\n***** Explicit Type Casting *****");
        System.out.println("Double value: " + decimalValue);
        System.out.println("Converted to int: " + intValue);

        // ***** Another Example *****
        char ch = 'A';
        int asciiValue = ch; // char to int (implicit)
        System.out.println("\nCharacter: " + ch);
        System.out.println("ASCII Value: " + asciiValue);

        int ascii = 66;
        char letter = (char) ascii; // int to char (explicit)
        System.out.println("Converted back to character: " + letter);
    }
}
