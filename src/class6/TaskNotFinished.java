package class6;

import java.util.Scanner;

public class TaskNotFinished {
    public static void main(String[] args) {
        /*
        Prompt the user to enter person heights in inches.
        Person should be classified as one of the following:
         • short (under 60 inch)
         • medium(between 60 -72 inch)
         • tall (over 72 inch)
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the heights in inches");

        int tall=scanner.nextInt();
        if (tall<60) {
            System.out.println("under 60 inch");
        } else
        System.out.println("over 72 inch");

    }
}
