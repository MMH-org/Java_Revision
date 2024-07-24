package src.w3schools.String_Methods;

import java.util.Scanner;

public class GetBytes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String name = scanner.nextLine();
        byte[] out = name.getBytes();
        for (int i = 0; i < name.length(); i++) {
            System.out.println(out[i] +" "+ i);
        }
    }
}
