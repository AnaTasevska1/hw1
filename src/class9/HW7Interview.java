package class9;
// From an array of integer elements find the largest number.
public class HW7Interview {
    public static void main(String[] args) {
        int[] elements={3,30,5,100,25};

        int largest=0;
        for (int i = 0; i < elements.length ; i++) {
            if (elements[i]>largest){
               largest=elements[i];
            }
        }  System.out.println(largest);
    }
}
