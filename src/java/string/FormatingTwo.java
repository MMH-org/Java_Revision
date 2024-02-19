package src.java.string;
import java.util.Scanner;
public class FormatingTwo {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line

            String s2=sc.next();
            int x2=sc.nextInt();

            String s3=sc.next();
            int x3=sc.nextInt();

            // first part
            String formattedNumber = String.format("%0" + 3 + "d", x);
            String leftJustifiedString = String.format("%-" + 15 + "s", s1);
            System.out.println(leftJustifiedString +""+formattedNumber);
            // second part
            String formattedNumber2 = String.format("%0" + 3 + "d", x2);
            String leftJustifiedString2 = String.format("%-" + 15 + "s", s2);
            System.out.println(leftJustifiedString2 +""+formattedNumber2);

            // 3rd part

            String formattedNumber3 = String.format("%0" + 3 + "d", x3);
            String leftJustifiedString3 = String.format("%-" + 15 + "s", s3);
            System.out.println(leftJustifiedString3 +""+formattedNumber3);
        }
        System.out.println("================================");









//        int x = 7;
//        String s = "example";
//
//        String formattedNumber = String.format("%0" + 3 + "d", x);
//        String leftJustifiedString = String.format("%-" + 15 + "s", s);
//        System.out.print(leftJustifiedString +""+formattedNumber);
////        System.out.println(formattedNumber);


    }
}
