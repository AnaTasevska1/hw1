package class9;

public class E8Arrays {
    public static void main(String[] args) {

        //print all the numbers from 6 to 0 in reverse order
        //{'A','B','C','D','E','F'}
        // 6 5 4 3 2 1 0

        char[] letters={'A','B','C','D','E','F'};

        for (int i = letters.length-1; i >=0; i--) {
                System.out.println(i+" "+letters[i]+" ");

        }
    }
}
