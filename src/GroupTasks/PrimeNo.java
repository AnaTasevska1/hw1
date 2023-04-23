package GroupTasks;
/*
Write a java program to check whether a given
number is prime or not?
 */
public class PrimeNo {
    public static void main(String[] args) {
        int num = 20;
        boolean isPrime = true;

        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }  //20 is an odd number because 6%2=true
    }
}
