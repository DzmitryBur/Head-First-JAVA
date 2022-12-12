package chapter3_Dog;

public class Dog {

    String name;

    public void bark() {
        System.out.println(name + " says 'Woof!'");
    }

    public void eat() {
    }

    ;

    public void chaseCat() {
    }

    ;


    public static void main(String[] args) {

        Dog dog1 = new Dog();
//		dog1.name = "Bart";
        dog1.bark();
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "George";

        System.out.print("The last dog's name is -  ");
        System.out.println(myDogs[2].name);


        for (int i = 0; i < myDogs.length; i++) {
            myDogs[i].bark();
        }

//		int x = 0;
//		
//		while (x < myDogs.length) {
//			myDogs[x].bark();
//			x = x + 1;
//		}


    }


}
