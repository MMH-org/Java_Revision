package src.ExceptionHandling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your age  ");
        int age= scanner.nextInt();
        if (age<=18){
        throw new ArithmeticException ("hey your age not eligible ");
        }
        else {
            System.out.print("Your age " + age + " and you are now eligible");
        }
    }
}
