package src.w3schools.String_Methods;

public class GetChars {
    public static void main(String[] args) {
        char[] myArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        System.out.println(myArray);

        String myStr = "Hello, World!";
        // Use the getChars method to copy characters from myStr to myArray
        // Parameters:
        // 7: starting index in myStr (inclusive)
        // 12: ending index in myStr (exclusive)
        // myArray: the destination array
        // 4: the starting position in the destination array where copying starts
        myStr.getChars(7, 12, myArray, 4);
        System.out.println(myArray);
    }
}
