package src.ProgrammingChallenge;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year which is leap year or Not ? :  ");
        int num = sc.nextInt();

        if (num % 400 == 0 || (num % 4 == 0 && num % 100 != 0)){
            System.out.println("This is leap lear");
        }
        else {
            System.out.println("Not leap year");
        }
    }
}
