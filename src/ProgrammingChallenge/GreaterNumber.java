package src.ProgrammingChallenge;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number A ,B and C :  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>=b && a>=c){
            System.out.println("A is greater "+ a);
        } else if (b>=c) {
            System.out.println("B is greater" + b);
        }
        else {
            System.out.println("C is greater" + c);
        }
    }
}
