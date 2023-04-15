package class7;

public class E12WhileLoop {
    public static void main(String[] args) {
        //ass all of the numbers from 1 to 10 and display the result 55
        //hint: first write a loop that goes from 1 to 10
        //create a variable top hold the sum and add all the numbers to that variable

        int counter=1;
        int sum=0;
        while (counter<=10){
            sum+=counter; //sum=sum+counter
            counter++;
        }
        System.out.println(sum);
    }
}
