package src;


import java.util.Scanner;

class  Algebra{
    int add(int a,int b){
        int ans= a+b;
        return ans;
    }
}






public class JavaMethods {
    public static void main(String[] args) {
        Algebra obj =new Algebra();
        Scanner sc =new Scanner(System.in);
        int input_a= sc. nextInt();
        int input_b=sc.nextInt();
        int result =obj.add(input_a,input_b);
        System.out.println(result);
    }
}
