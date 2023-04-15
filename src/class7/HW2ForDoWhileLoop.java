package class7;
      // Print numbers from 100 to 1
public class HW2ForDoWhileLoop {
    public static void main(String[] args) {

        int counter = 100;
        while (counter >= 1) {
            System.out.print(counter + " ");
            counter--;
        }
        System.out.println();
        for (int counter1 = 100; counter1 >= 1; counter1--) {
            System.out.print(counter1 + " ");
        }
        System.out.println();
        int counter2=100;
        do {
            System.out.print(counter2+" ");
            counter2--;
        }while (counter2>=1);
    }
}

