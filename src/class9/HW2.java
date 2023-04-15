package class9;
/*
Create an array of names and store all names of your group.
Then print your name from that array. (use 2 different ways of creating an array).
 */
public class HW2 {
    public static void main(String[] args) {

        String[] names={"Ana","Nela","Kiko","Mila","Iko"};
        System.out.println(names[0]);

        String[] name={"Ana","Nela","Kiko","Mila","Iko"};
        name[0] = "Ana";
        name[1] = "Nela";
        name[2] = "Kiko";
        name[3] = "Mila";
        name[4] = "Iko";
        System.out.println(name[0]);

    }
}
