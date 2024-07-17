package src.w3schools.String_Methods;

public class CodePointCount {
    public static void main(String[] args) {
        String myStr = "Hello";
        int result = myStr.codePointCount(0, myStr.length());
        System.out.println(result);
    }
}
