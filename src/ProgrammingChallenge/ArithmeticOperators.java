package src.ProgrammingChallenge;

import java.util.Scanner;

public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("arithmetic operators");
        System.out.print("Enter First number :  ");
        int first = sc.nextInt();
        System.out.print("Enter second number :  ");
        int second = sc.nextInt();

//        (+,-,*,/,% )
        int sum = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;
        int rem = first % second;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
    }
}
