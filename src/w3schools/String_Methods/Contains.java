package src.w3schools.String_Methods;

public class Contains {
    public static void main(String[] args) {
        String myName = "MdMohsinHaider";
        System.out.println(myName.contains("Md")); // true
        System.out.println(myName.contains("Mohsin")); // true
        System.out.println(myName.contains("Haider")); // true
        System.out.println(myName.contains("MMH"));
    }
}
