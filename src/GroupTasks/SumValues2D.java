package GroupTasks;
/*
Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
 */
public class SumValues2D {
    public static void main(String[] args) {
        int[][] values={{1,33,10,2,8,5},
                        {5,8,6,2,8}};

        int sum=0;
        for (int i = 0; i < values.length ; i++) {
            for (int j = 0; j < values[i].length; j++) {
                sum = sum + values[i][j];
            }
        }System.out.println(sum);
        }
    }

