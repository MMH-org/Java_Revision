package src.Basic;

import java.util.Scanner;

public class InPutOutPut {
    public void readWrite() { // this file run in Main.java file
        Scanner sc_object_1=new Scanner(System.in); // creating an object of Scanner class
        Scanner sc_object_2=new Scanner(System.in); // creating an object of Scanner class

        System.out.print("Enter string next() In Put :  ");
        String name_1= sc_object_1.next();
        System.out.println("next() function out Put is :  "+name_1);

        System.out.print("Enter string nextLine() Input :  ");
        String name_2 = sc_object_2.nextLine();
        System.out.println("nextLine() Function Out Put is :  "+name_2);
    }
}
