package Replit;
// print the 2D array
public class Array2D {
    public static void main(String[] args) {
        double[][] numbers = {{1.4, 2.0, 3.3, 2.0},
                {4.0, 1.5, 6.1, 1.0},
                {1.2, 3.1, 4.0, 1.6}};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println();
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }
    }
}