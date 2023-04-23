package GroupTasks;
/*
Create an array of integer values. After the array is
created, calculate the sum of all stored elements in
that array.
 */
public class SumValues1D {
    public static void main(String[] args) {
        int[] values={1,33,10,2,8,5};

        int sum=0;
        for (int i = 0; i < values.length ; i++) {
                sum = sum + values[i];

        }System.out.println(sum);
    }
}