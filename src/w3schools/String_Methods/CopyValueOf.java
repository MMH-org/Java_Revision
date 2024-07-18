package src.w3schools.String_Methods;

public class CopyValueOf {
    public static void main(String[] args) {
        char[] myStr1 = {'H', 'e', 'l', 'l', 'o'};
        String myStr2 = "";
        myStr2 = myStr2.copyValueOf(myStr1, 1, 3);
        System.out.println("Returned String: " + myStr2);
    }
}
