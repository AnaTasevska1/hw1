package class11;

public class E4D2Array {
    public static void main(String[] args) {
        int[][] arr2D = {{10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        // print only odd numbers from this 2D array
        //arr[i] => gives me the array at specific index by i
        // int[] innerArray=arr[i]; => innerArray.length

        for (int[] array1D:arr2D){
            for (int num : array1D) {
                System.out.print(num+" ");
            }
                }
            }
        }