package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {
        // in a while loop ask the user to enter numbers if user enters any number
        //other than -1 print "Hello world" and keep on asking the user for a number
        //the moment user enters the number -1 the loop should start

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter numbers");
        int number = scanner.nextInt();

        while (number != -1) {
            System.out.println("Please try again");
            number = scanner.nextInt();
        }
    }
}