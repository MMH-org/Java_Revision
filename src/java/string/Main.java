package src.java.string;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++) {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            // Format the string column
            System.out.printf("%-15s", s1);

            // Format the integer column with leading zeros if necessary
            System.out.printf("%03d%n", x);
        }
        sc.close();
        System.out.println("================================");
    }
}

