package GroupTasks;

/*
Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
 */
public class SumEvenOdd2D {
    public static void main(String[] args) {
        int[][] array = {{5, 52, 9, 1, 4},
                {8, 2, 5, 4},
                {10, 20, 30, 5, -6}};

        int sumOdd = 0;
        int sumEven = 0;
        int number;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                number = array[i][j];

                if (number % 2 == 0) {
                    sumEven += number;
                } else {
                    sumOdd += number;
                }
            }
        }
        System.out.println("Sum of even = " + sumEven);
        System.out.println("Sum of odd = " + sumOdd);
    }
}

