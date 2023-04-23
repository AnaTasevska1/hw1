package GroupTasks;
/*
Write a program to swap 2 numbers without a
temporary variable?
 */
public class Swap2No {
    public static void main(String[] args) {

        int a=5;
        int b=10;

        a = a + b;  //15
        b = a - b;  //5
        a = a - b;  //10
        System.out.println(" After swap : ");
        System.out.println(" a = " + a);
        System.out.println(" b = " + b);

    }
}
