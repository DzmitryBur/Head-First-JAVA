package chapter4_electric_guitar;

public class ElectricGuitar {

    String brand;
    int numOfPikcups;
    boolean rockStarUsesIt;

    String getBrand() {
        return brand;
    }

    void setBrand(String aBrand) {
        brand = aBrand;
    }

    int getNumOfPikcups() {
        return numOfPikcups;
    }

    void setNumOfPikcups(int num) {
        numOfPikcups = num;
    }

    boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

}
