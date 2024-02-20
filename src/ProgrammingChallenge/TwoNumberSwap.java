package src.ProgrammingChallenge;

import java.util.Scanner;

public class TwoNumberSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome two number swap solution ");
        System.out.print("Enter Number A :  ");
        Byte a = sc.nextByte();
        System.out.print("Enter Number B :  ");
        Byte b = sc.nextByte();

        Byte c= a;
        a=b;
        b=c;
        System.out.println("Swap value of A :  " + a);
        System.out.print("Swap Value of B :  " + b );
    }
}
