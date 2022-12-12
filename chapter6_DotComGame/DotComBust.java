import java.util.ArrayList;

public class DotComBust {

    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    public void setUpGame () {
        // create some "sites" and give them adressess
        DotCom one = new DotCom();
        one.setName("Onliner.by");
        DotCom two = new DotCom();
        two.setName("Pressball.by");
        DotCom three = new DotCom();
        three.setName("NBRB.by");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink THREE 'sites'.");
        System.out.println("Onlener.by, Pressball.by, NBRB.by");
        System.out.println("Try to sink them in the minimum number of moves");

        for (DotCom dotComToSet : dotComList) {

            ArrayList<String> newLocation = helper.placeDotCom(3);

            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying() {

        while (!dotComList.isEmpty()) {

            String userGuess = helper.getUserInput("Make a move (from A0 to G6)");
            checkUserGuess(userGuess);
        }
    }

    public void checkUserGuess(String userGuess) {

        numOfGuesses++;

        String result = "Past/Мимо";

        for (DotCom dotComToTest : dotComList) {

            result = dotComToTest.checkYourself(userGuess);

            if (result.equals("Hit/Попал")) {
                break;
            }
            if (result.equals("Sunk/Потопил")) {
                dotComList.remove(dotComToTest);
                break;
            }

        }

        System.out.println(result);
    }

    public void finishGame() {
        System.out.println("All sites SUNK!!!");

        if (numOfGuesses <= 18) {
            System.out.println("It only took you" + numOfGuesses + " tries.");
        } else {
            System.out.println("It took you quite a long time." + numOfGuesses + " tries.");
        }
    }

}
