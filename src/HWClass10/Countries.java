package HWClass10;
/*
Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and calculate how many total countries been stored.
 */
public class Countries {
    public static void main(String[] args) {
        String[][] countries={{"Canada", "USA", "Mexico"},
                           {"Brazil", "Argentina", "Peru"},
                           {"Macedonia", "Greece", "Serbia", "Spain"},
                           {"China", "India", "Japan"},
                           {"Nigeria", "South Africa", "Kenya"}};

        int counter=0;
        for (String[] country : countries) {
            for (String s : country) {
                counter++;
                System.out.print(s+" ");
            }
            System.out.println();
        } System.out.println(counter);
        }
        }


