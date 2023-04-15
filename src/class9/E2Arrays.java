package class9;
/*
 create an array of int and store numbers from 30 40 50 90 inside it and access only the number 50
         */
public class E2Arrays {
    public static void main(String[] args) {
        /*
        when we try to access an element using an index which does not exists,
         System.out.println(numbers[20]);
         System.out.println(numbers[-2]);
         we get an error "ArrayIndexOutOfBoundsException"
         */

        int[] numbers={30,40,50,90};
        System.out.println(numbers[2]);

    }
}
