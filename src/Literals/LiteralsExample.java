package src.Literals;

public class LiteralsExample {
    public static void main(String[] args) {
        // Integer literals
        int decimal = 100;
        int binary = 0b1100100;
        int octal = 0144;
        int hex = 0x64;

        // Floating-point literals
        double doubleNum = 10.5;
        float floatNum = 10.5f;

        // Character literal
        char ch = 'A';

        // String literal
        String str = "Hello, Java!";

        // Boolean literals
        boolean isTrue = true;
        boolean isFalse = false;

        // Null literal
        String emptyStr = null;

        // Printing literals
        System.out.println("Decimal: " + decimal);
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hex: " + hex);
        System.out.println("Double: " + doubleNum);
        System.out.println("Float: " + floatNum);
        System.out.println("Char: " + ch);
        System.out.println("String: " + str);
        System.out.println("Boolean true: " + isTrue);
        System.out.println("Boolean false: " + isFalse);
        System.out.println("Null String: " + emptyStr);
    }
}
