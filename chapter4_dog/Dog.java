package chapter4_dog;

public class Dog {

    private int size;
    private String name;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Gav! Gav!");
        } else if (size > 14) {
            System.out.println("Woof! Woof!");
        } else {
            System.out.println("Taf! Taf!");
        }
    }


}



