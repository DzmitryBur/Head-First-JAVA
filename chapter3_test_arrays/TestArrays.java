package chapter3_test_arrays;

public class TestArrays {

    public static void main(String[] args) {

        int[] index = new int[4];
        index[0] = 1;
        index[1] = 3;
        index[2] = 0;
        index[3] = 2;

        String[] islands = new String[4];

        islands[0] = "Bermuds";
        islands[1] = "Fiji";
        islands[2] = "Azors";
        islands[3] = "Kosumel";


        int y = 0;

        while (y < 4) {
            int ref = index[y];
            System.out.print("islands = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }


    }

}
