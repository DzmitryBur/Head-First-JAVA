package chapter4_electric_guitar;

public class ElectricGuitarTestDrive {

    public static void main(String[] args) {

        ElectricGuitar one = new ElectricGuitar();
        ElectricGuitar two = new ElectricGuitar();
        ElectricGuitar three = new ElectricGuitar();

        one.setBrand("Ibanez"); // �������� ��������� ����� ������
        two.brand = "Balalaika"; // �������� ��������� �������� � ������ �������
        three = two;


        System.out.println(one.getBrand());
        System.out.println(two.getBrand());
        System.out.println(three.getBrand());
    }

}
