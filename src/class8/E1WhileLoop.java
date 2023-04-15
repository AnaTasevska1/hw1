package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        //print all whole numbers from a starting point to an ending point
        //ask the user for starting, ending number and the step

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter starting number, ending and the step");
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        int step=scanner.nextInt();
        int number=start;
        while (number<=end){
            System.out.print(number+" ");
            number=number+step; //number+=step;
        }
    }
}
