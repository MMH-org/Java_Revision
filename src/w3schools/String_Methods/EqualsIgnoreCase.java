package src.w3schools.String_Methods;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String name1 = "mohsin";
        String name2 = "MOHSIN";
        String name3 = "Mohsin";

        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name1.equalsIgnoreCase(name3));
    }
}
