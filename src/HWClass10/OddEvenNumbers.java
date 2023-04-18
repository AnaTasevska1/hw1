package HWClass10;
/*
Create a 2D array or integer type where you will store odd and even numbers in 3 rows and 4 columns.
Develop a program which will identify/print the even numbers only.
 */
public class OddEvenNumbers {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3,4},
                         {7,3,5,2},
                         {6,2,1,6}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
    }
}
