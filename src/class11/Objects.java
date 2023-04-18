package class11;

import java.util.Scanner;

public class Objects {
    public static void main(String[] args) {
        // Declare arrays to store student information
        String[] name = new String[5];
        int[] id = new int[5];
        int[] age = new int[5];
        char[] grade = new char[5];
        double[] weight = new double[5];

        // Read in information for each student
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter information for student " + (i + 1) + ":");
            System.out.print("Name: ");
            name[i] = scanner.nextLine();
            System.out.print("ID: ");
            id[i] = scanner.nextInt();
            System.out.print("Age: ");
            age[i] = scanner.nextInt();
            System.out.print("Grade: ");
            grade[i] = scanner.next().charAt(0);
            System.out.print("Weight: ");
            weight[i] = scanner.nextDouble();
            scanner.nextLine(); // consume newline character
        }

        // Print out information for each student
        System.out.println("\nStudent Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + name[i]);
            System.out.println("ID: " + id[i]);
            System.out.println("Age: " + age[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println("Weight: " + weight[i]);
            System.out.println();
        }
    }
}
