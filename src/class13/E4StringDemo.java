package class13;
// split strings based on sentences
public class E4StringDemo {
    public static void main(String[] args) {
        String str="Today is Sunday. we have class? we like java";
        String [] strArr=str.split("[.!?]");
        System.out.println(strArr.length);
        System.out.println(strArr[2].trim());
    }
}
