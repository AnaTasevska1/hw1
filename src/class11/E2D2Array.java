package class11;

public class E2D2Array {
    public static void main(String[] args) {

        String[][] names={{"Sarah","Artem","Lean","Semir"},
                {"Farwa","Halima","Alina","Ana"}};

        for (int rowNo = 0; rowNo < names.length; rowNo++) {
            System.out.println();
            for (int colNo = 0; colNo < names[rowNo].length; colNo++) {

                System.out.print(names[rowNo][colNo]+" ");
            }
            }
        }
    }

