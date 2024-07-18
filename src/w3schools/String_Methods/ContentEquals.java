package src.w3schools.String_Methods;

public class ContentEquals {
    public static void main(String[] args) {
        String myString = "hello";
        System.out.println(myString.contentEquals("hello"));
        System.out.println(myString.contentEquals("Hello"));
        System.out.println(myString.contentEquals("hell"));
    }
}
