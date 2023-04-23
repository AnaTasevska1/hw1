package class12;

import java.net.SocketTimeoutException;

public class E9StringDemoEnds {
    public static void main(String[] args) {

        String sentence="I don't see SEARCH result";

        System.out.println(sentence.endsWith("result"));
        System.out.println(sentence.contains("see"));
    }
}
