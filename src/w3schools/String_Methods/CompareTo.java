package src.w3schools.String_Methods;

public class CompareTo {
    public static void main(String[] args) {
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal

//        case two if difference
        String myStr3 = "Hell";
        String myStr4 = "Hello";
        System.out.println(myStr3.compareTo(myStr4)); // Returns 0 because they are equal
    }
}
