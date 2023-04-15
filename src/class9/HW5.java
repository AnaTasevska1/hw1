package class9;
/*
Create an array of animals and store 5 elements into it.
Using 2 different loops print all elements from the array.
 */
public class HW5 {
    public static void main(String[] args) {
        String[] animals={"Dog","Cat","Mouse","Bunny","Fox"};

        for (int i = 0; i < animals.length ; i++) {
            System.out.print(animals[i]+" ");
        }
        System.out.println();
        int number=0;
        while (number < animals.length) {
            System.out.print(animals[number]+" ");
            number++;
        }
    }
}
