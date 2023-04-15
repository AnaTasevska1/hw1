package class4;

import java.util.Scanner;

public class AmountOfLoanHW2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the loan amount");

        double loan = scanner.nextDouble();

        if (loan <= 200.000) {
            System.out.println("The money will be lent");
        } else {
            System.out.println("You are rejected");
        }

    }
}

/*
2) You are a loan specialist and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.

 */
