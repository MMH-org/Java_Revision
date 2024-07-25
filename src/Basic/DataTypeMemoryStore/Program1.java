package src.Basic.DataTypeMemoryStore;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Check Your number which dataType is suitable ");
        long num = scanner.nextInt();

        if (num<=127){
            System.out.println(num + " your number is best for Byte datatype");
        } else if (num<=32767) {
            System.out.println(num + " Your number is best for Short datatype");
        } else if (num <= 2147483647) {
            System.out.println(num+" your number is best for int data");
        }
        else {
            System.out.println("Soon ");
        }
    }
}
