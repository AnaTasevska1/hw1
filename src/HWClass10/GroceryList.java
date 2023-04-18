package HWClass10;
/* Using 2D array create a grocery list.
   Inside you should have an array of veggies, fruits, dairy and sweets.
   Retrieve all values from that array using 2 different loops */

public class GroceryList {
    public static void main(String[] args) {
        String[][] grocery={{"Tomato","Potato","Cucumber"},
                               {"Apple","Cherry","Peach"},
                                {"Milk","Cheese","Yogurt"},
                            {"Candies","Cookies","Biscuits"}};

        for (int i = 0; i < grocery.length; i++) {
            for (int j = 0; j < grocery[i].length; j++) {
                System.out.print(grocery[i][j]+" ");
            }
        } System.out.println();
        for (String[] strings : grocery) {
            for (String string : strings) {
                System.out.print(string+" ");
            }
        }
    }
}
