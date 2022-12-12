package Chapter3_Books;

public class BooksTestDrive {

    public static void main(String[] args) {

        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();

        myBooks[0].title = "Foods Java";
        myBooks[1].title = "Java Gatsbey";
        myBooks[2].title = "Riecipie of Java";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Su";
        myBooks[2].author = "Jan";

        for (int i = 0; i < myBooks.length; i++) {
            System.out.print(myBooks[i].title);
            System.out.print(", author: ");
            System.out.println(myBooks[i].author);

        }


    }

}
