package chapter4_dog;

public class DogTestDrive {

    public static void main(String[] args) {

        Dog one = new Dog();
//		one.size = 70; // ��� ������ ���������� "size" �������� � ������������� "private" - ��� ����� ����������
        one.setSize(70);
        one.setName("Sharik");

        Dog two = new Dog();
//		two.size = 30; // ��� ������ ���������� "size" �������� � ������������� "private" - ��� ����� ����������
        two.setSize(30);

        Dog three = new Dog();
//		three.size = 5; // ��� ������ ���������� "size" �������� � ������������� "private" - ��� ����� ����������
        three.setSize(5);

        Dog four = new Dog();

        System.out.println("First dog's size is: " + one.getSize());
        System.out.println("Second dog's size is: " + two.getSize());
        System.out.println("Third dog's size is: " + three.getSize());
        System.out.println("Fourth dog's size is: " + four.getSize());

        System.out.println("First dog's name is: " + one.getName());
        System.out.println("Fourth dog's name is: " + four.getName());

        one.bark();
        two.bark();
        three.bark();


    }

}
