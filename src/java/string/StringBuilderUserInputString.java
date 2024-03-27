package src.java.string;

import java.util.Scanner;

public class StringBuilderUserInputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(userInput);
        System.out.println(stringBuilder);
    }
}
