package class9;
/*
Create an array of chars and store grades into it: A,B,C,D.
Then print a grade B (use 2 different ways of creating an array).
 */
public class HW1 {
    public static void main(String[] args) {

        char[] letters={'A','B','C','D'};
        System.out.println(letters[1]);

        int i=1;
        System.out.println(letters[i]);

        char[] letter={'A','B','C','D'};
        letter[0] = 'A';
        letter[1] = 'B';
        letter[2] = 'C';
        letter[3] = 'D';
        System.out.println(letter[1]);
    }
}

