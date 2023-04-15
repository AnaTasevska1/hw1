package class7;
   // Print even numbers from 20 to 1 (2 ways)
public class HW3EvenNumbers {
       public static void main(String[] args) {

           int i=20;
           while (i>=1) {
               System.out.print(i+" ");
               i-=2;
           }
           System.out.println();
           for (int a=20; a>=1; a-=2){
               System.out.print(a+" ");
           }
           System.out.println();
           int b=20;
           do {
               System.out.print(b+" ");
               b-=2;
           }while (b>=1);
       }
}
