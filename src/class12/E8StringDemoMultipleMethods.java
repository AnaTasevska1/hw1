package class12;

public class E8StringDemoMultipleMethods {
    public static void main(String[] args) {
        String sentence="   JAVA is very very easy";
        // method chaining calling multiple methods on the same line

        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);
        System.out.println(sentence.startsWith("java"));

    }
}
