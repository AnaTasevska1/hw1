package HWClass10;
/*
Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
Print the sum of all numbers.
 */
public class NumbersSum {
    public static void main(String[] args) {
        int[][] numbers={{1,2,3},
                         {4,3,5},
                         {9,6,7}};

        int sum=0;
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                sum=numbers[i][j]+sum;
                }
            }System.out.println(sum);
        }
            }


