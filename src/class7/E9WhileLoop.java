package class7;

public class E9WhileLoop {
    public static void main(String[] args) {

        // print 25 20 10 5 using a while loop, Hint using if conditions

        int a=25;
        while (a>=5){
            if (a!=15) {
                System.out.print(a + " ");
            }
                a -= 5;
        }
    }
}
