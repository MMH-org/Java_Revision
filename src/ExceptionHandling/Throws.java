package src.ExceptionHandling;

public class Throws {
    public static void demoFun(int dividend ,int divisor){
        System.out.println(dividend/divisor);
    }

    public static void main(String[] args) throws Exception {
        demoFun(10,2);
    }
}
