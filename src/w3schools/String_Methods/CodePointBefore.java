package src.w3schools.String_Methods;

public class CodePointBefore {
    public static void main(String[] args) {
        String myStr = "Hello";
        int result = myStr.codePointBefore(1);
        System.out.println(result);
    }
}
