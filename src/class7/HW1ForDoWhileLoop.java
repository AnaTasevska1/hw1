package class7;
//Print numbers from 1 to 100 in 1 line with space
public class HW1ForDoWhileLoop {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 100) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();
        for (int counter1 = 1; counter1 <= 100; counter1++) {
            System.out.print(counter1 + " ");
        }
        System.out.println();
        int counter2=1;
        do {
            System.out.print(counter2+" ");
            counter2++;
        }while (counter2<=100);
    }
}