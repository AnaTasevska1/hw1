package Replit;

import java.util.Objects;
import java.util.Scanner;

public class LogicalOpScannerIf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1=scanner.next();
        String word2=scanner.next();

        System.out.println("Please enter two numbers");
        int int1=scanner.nextInt();
        int int2=scanner.nextInt();

        if (int1==int2 && word1.equals(word2)){
            System.out.println("AND");
        } else if (int1==int2 || word1.equals(word2)){
            System.out.println("OR");
        } else if (int1!=int2 && word1!=word2){
            System.out.println("NONE");
        }
    }
}

