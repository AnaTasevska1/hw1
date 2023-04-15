package Replit;

public class NestedLoops3 {
    public static void main(String[] args) {
        for (int row = 7; row >= 1; row--) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        } for (int row1 = 1; row1 <= 7; row1++) {
                for (int column1 = 1; column1 <= row1; column1++) {
                    System.out.print(column1 + " ");
                }
            System.out.println();
        }
    }
}
/*
Can you please explain how to solve this:

Write a program to print out the pattern:

1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
 */