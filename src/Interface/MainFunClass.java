package src.Interface;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainFunClass {
    public static void main(String[] args) {

        String Input = "Enter a Number ";
        String Out = "Your Out put is ";

        Scanner scanner = new Scanner(System.in);

        System.out.print(Input +"X = ");
        int x= scanner.nextInt();

        System.out.print(Input+"Y = ");
        int y= scanner.nextInt();

        Calculation calculate = new Calculate();

        int result = calculate.Addition(x,y);
        System.out.println(Out +" "+result);

        int resultSub = calculate.Sub(x,y);
        System.out.println(Out+" "+resultSub);
    }

}
