package class12;

public class E5StringDemo {
    public static void main(String[] args) {
        String name="   ";
        System.out.println(name.isEmpty());     // it's empty but there are spaces that's why it's false
        System.out.println(name.isBlank());    // it checks the spaces as well
    }
}
