package GroupTasks;
//  Write a java program to find the second largest number in the array?
public class SecondLargest {
    public static void main(String[] args) {
        int[] num={5,20,80,13,5,7,15,10,100};

        int largest=0;
        int secondLargest=0;
        for (int i = 2; i < num.length; i++) {
            if (largest<num[i]){
                secondLargest = largest;
                largest=num[i];
            } else if (num[i]>secondLargest && num[i] != largest) {
                secondLargest = num[i];
            }
        }
        System.out.println("Second largest number: " + secondLargest);
    }
}
