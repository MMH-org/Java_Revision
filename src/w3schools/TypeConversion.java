package src.w3schools;

public class TypeConversion {
    public static void main(String[] args) {
        byte b= 127;
        int a = 12;


//        Case first smaller container store big value
//        b=a // wrong
        b=(byte) a; // b= (byte)a :this is a correct way
        System.out.println(b);


//        Case Two containers large and value store small
//        a=b;
//        System.out.println(a);
    }
}
