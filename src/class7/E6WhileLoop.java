package class7;

public class E6WhileLoop {
    public static void main(String[] args) {
        // print these numbers 2 4 6 8 10 12 14 using a while loop

        int num=2;
        while (num<=14){
            System.out.println(num);
            //below line will increase the value of the num by 2 everytime
            num+=2;  //diff ways:  num=num+2  ;  num++  num++
            //num++;
            //num++;
        }
    }
}
