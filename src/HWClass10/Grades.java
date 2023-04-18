package HWClass10;
/*
Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
Then your program should print name of the students that has A and B grade
 */
public class Grades {
    public static void main(String[] args) {
        String[][] student={{"Ana", "Mila", "Iko", "Kiko"},
                              {"A", "B", "C", "D"}};

        for (int i = 0; i < student.length; i++) {
                if (student[0][i].equals("A") && student[1][i].equals("B")) {

                } System.out.print(student[0][i] + " ");
            }
        }
    }

