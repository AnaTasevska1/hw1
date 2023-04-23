package GroupTasks;
/*
Create a 2D array or integer type where you will store odd and even numbers.
Develop a program which will identify/print the even numbers only.
 */
public class OddEvenNumbers2D {
    public static void main(String[] args) {
        int[][] num={{5,8,2,30},
                     {8,5,20},
                   {4,8,20,5,3}};


        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j]%2==0){
                    System.out.print(num[i][j]+" ");
                }
            }
        }
    }
}
