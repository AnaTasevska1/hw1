package class7;
  // Print odd numbers between 20 and 50 (2 ways)
public class HW4OddNumbers {
      public static void main(String[] args) {

          int num1 = 20;
          while (num1 <= 50) {
              if (num1 % 2 != 0) {
                  System.out.print(num1 + " ");
              }
              num1++;
          }
          System.out.println();
          for (int num2 = 20; num2 <= 50; num2++) {
              if (num2 % 2 != 0) {
                  System.out.print(num2 + " ");
              }
          }
      }
  }
