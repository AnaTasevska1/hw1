package class4;

import java.util.Scanner;

public class CustomerAgeHW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please tell me your age");

        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You will get a driver licence");
        } else {
            System.out.println("Get a learners permit");
        }

    }
}

/*
3)You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.
 */