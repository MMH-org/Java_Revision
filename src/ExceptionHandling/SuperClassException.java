package src.ExceptionHandling;

public class SuperClassException {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=a/b;
            System.out.println(c);
        }catch (Exception e){
            System.out.println(e.getClass() +" <=> "+ e.getMessage());
        }
    }
}
