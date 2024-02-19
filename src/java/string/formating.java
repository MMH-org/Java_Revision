package src.java.string;

public class formating {
    public static void main(String[] args) {
        String str = "example";
        int width = 10;
        String leftJustifiedString = String.format("%-" + width + "s", str);
        System.out.print(leftJustifiedString); // Output: "example   "
        System.out.println("]");

        System.out.println(".........................new....................................");
        int x = 7;
//        int desiredDigits = 3;
        String formattedNumber = String.format("s1 %0" + 3 + "d", x);
        System.out.println(formattedNumber); // Output: "007"


    }
}
