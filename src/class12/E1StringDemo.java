package class12;

public class E1StringDemo {
    public static void main(String[] args) {
        // create the object of that clas
        // ClassName objectName = new Name ClassName();
        String string=new String("Ana");
        String string1="Ana";   // Most widely used one (String class)
        System.out.println(string1.length());   // There are 3 letters in the name Ana

        String name="Axel";

        if (name.length()>8){
            System.out.println("Only 8 characters are allowed");
        }
    }
}
