public class SonOfBoo extends Boo {

    public SonOfBoo() {
        super("boo");
    }

    public SonOfBoo(int i) {
        super("Fred");
    }

    public SonOfBoo(String a) {
        super(42);
    }

//    public SonOfBoo(int i, String s) { /* java: no suitable constructor found for Boo(no arguments) constructor Boo.Boo(int) is not applicable*/
//    }

//    public SonOfBoo(String a, String b, String c) { // java: incompatible types: java.lang.String cannot be converted to int
//        super(a, b);
//    }

    public SonOfBoo(int i, int j) {
        super("man", j);
    }

//    public SonOfBoo(int i, int x, int y) { // java: incompatible types: int cannot be converted to java.lang.String
//        super(i, "star");
//    }



    public static void main(String[] args) {


    }
}

