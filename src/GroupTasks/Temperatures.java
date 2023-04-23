package GroupTasks;
/*
Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
public class Temperatures {
    public static void main(String[] args) {
        int[] temperatures = {28, 25, 30, 32, 27, 29, 26};

        int highest = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (highest < temperatures[i]) {
                highest = temperatures[i];
            }
        }
        int lowest = temperatures[0];
        for (int i = 0; i < temperatures.length; i++) {
            if (lowest > temperatures[i]) {
                lowest = temperatures[i];
            }
        }
        System.out.println("Highest temperature: " + highest);
        System.out.println("Lowest temperature: " + lowest);
    }
}
