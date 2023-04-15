package class7;

public class E11WhileLoop {
    public static void main(String[] args) {
        /* print numbers from 100 to 1
        print even numbers from 20 to 100
        print only odd numbers from 100 to 1
         */
        int a=100;
        while (a>0){  //same as a>=1
                System.out.print(a + " ");
            a--;
        }
        a=20;
        System.out.println();
        while (a<=100){
            System.out.print(a+" ");
            a+=2;
        }
        a=100;
        //so that we can see the next output on a new line > sout
        System.out.println();
        while (a>=1){
            // odd numbers when divided by 2 gives 1 as remainder
            if (a%2==1){  //its same as a%2!=0
                System.out.print(a+" ");
            }
            a--;
        }
    }
}
