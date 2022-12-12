package chapter2_movie;

public class MovieTestDrive {

    public static void main(String[] args) {

        Movie one = new Movie();
        one.title = "How to loose with stocks";
        one.genre = "Tragedy";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in the ofice";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte-Club";
        three.genre = "Tragedy with comedy";
        three.rating = 127;

    }

}

