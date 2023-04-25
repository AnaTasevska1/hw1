package class13;
/*
Create a String that should be combination of letters, numbers and special characters.
Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
 */
public class Task2Combination {
    public static void main(String[] args) {
        String str="fghjkhfghjkFDGHJKHGHJ423567876597%^&*(&^%";
     //   System.out.println(str.replaceAll("[^a-zA-Z]","").length());
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());

        }
    }


