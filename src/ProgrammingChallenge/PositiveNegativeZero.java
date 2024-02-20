package src.ProgrammingChallenge;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for  positive negative zero :  ");
        int num = sc.nextInt();

        if (num == 0) {
            System.out.println("the number is Zero " + num);
        } else if (num >= 1) {
            System.out.println("positive number");
        }
        else {
            System.out.println("negative");
        }
    }
}
