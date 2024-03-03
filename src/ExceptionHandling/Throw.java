package src.ExceptionHandling;

public class Throw {
    public static void main(String[] args){
        int age=10;
        if (age<=18){
        throw new ArithmeticException ("hey dear is this is wrong age ");
        }
        else {
            System.out.println("You are eligible");
        }
    }
}
