package Chapter3_Hobbits;

public class HobbitsTestDrive {

    public static void main(String[] args) {

        Hobbits[] h = new Hobbits[3];

        h[0] = new Hobbits();
        h[1] = new Hobbits();
        h[2] = new Hobbits();

        h[0].name = "Bilbo";
        h[1].name = "Frodo";
        h[2].name = "Sam";

        for (int i = 0; i < h.length; i++) {
            System.out.print("Name of good hobbit is: ");
            System.out.println(h[i].name);
        }

    }

}
