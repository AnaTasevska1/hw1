package GroupTasks;
// Write a program to print out duplicate elements from an Array of Strings?
public class DuplicateElements {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "apple", "fig", "grape", "banana", "kiwi", "date"};

        System.out.println("Duplicate elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}