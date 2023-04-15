package class10;

public class E5D2Array {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30,40,50},
                {20,50,65,20},
                {102,54,60},
                {20,55}
        };
        for (int row = 0; row < matrix.length; row++) {    //i - row  ;   j- element
          //  int [] arr=matrix[i];
            for (int column = 0; column < matrix[row].length; column++) {
                //matrix[i] => will return the complete 1D array at the index specified by the value of i
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }
    }
}
