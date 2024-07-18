package src.w3schools.String_Methods;

public class EndsWith {
    public static void main(String[] args) {
        String myString = "Mohsin";
        System.out.println(myString.endsWith("in")); // true
        System.out.println(myString.endsWith("sin")); // true
        System.out.println(myString.endsWith("h")); // false
        System.out.println(myString.endsWith("M")); // false
    }
}
