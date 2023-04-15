package class9;
// Create an array on integers and calculate the sum of all elements in an array
public class HW6 {
    public static void main(String[] args) {
        int[] numbers={1,5,10,15,20};
        System.out.println(numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4]);


        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
            System.out.println(sum);
        }
    }

