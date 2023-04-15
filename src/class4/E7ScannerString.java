package class4;

import java.util.Scanner;

public class E7ScannerString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name = scanner.next();

        if (name.equals("Ance")) {
            System.out.println("Mac user");
        } else if (name.equals("Gorast")) {
            System.out.println("Naughty");
        } else if (name.equals("Anna")) {
            System.out.println("Best");
        } else if (name.equals("Axel")) {
            System.out.println("Bad boy");
        }
    }
}
