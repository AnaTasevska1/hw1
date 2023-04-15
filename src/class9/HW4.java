package class9;
/*
Create an array of cars and store 6 elements into it.
Using 2 different loops print all values from the array.
 */
public class HW4 {
    public static void main(String[] args) {
        String[] cars={"BMW","Audi","Ferrari","Benz"};

        for (int j = 0; j <=3; j++) {
            System.out.print(cars[j]+" ");
        }

        System.out.println();
        int counter=0;
        while (counter<cars.length){
            System.out.print(cars[counter]+" ");
            counter++;
        }
    }
}
