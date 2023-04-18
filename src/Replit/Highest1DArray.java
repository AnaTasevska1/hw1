package Replit;
// Write a program that prints the highest value in the array.
public class Highest1DArray {
    public static void main(String[] args) {
        int[] input={5, 4, 8};

        int highest=0;
        for (int i=0; i<input.length; i++){
            if (input[i]>highest){
                highest=input[i];
            }
        }System.out.println(highest);

    }
    }

