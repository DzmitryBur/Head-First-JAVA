import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Locale;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        }
        catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String[comSize];    // is saving coordinates like B6
        String temp = null;                             // temporary string for concatenate
        int [] coords = new int[comSize];               // current site coordinates
        int attempts = 0;                               // counter of current attempts
        boolean success = false;                        // found the right location
        int location = 0;                               // current home position

        comCount++;                                     // n site to accommodate
        int incr = 1;                                   // set the horizontal increment
        if ((comCount % 2) == 1) {                      // if the odd is placed vertically
            incr = gridLength;                          // set the horizontal increment
        }

        while ( !success & attempts++ < 200) {          // main search cycle
            location = (int) (Math.random() * gridSize);// get sa random starting point
//            System.out.println("try" + location);
            int x = 0;                                  // position "n" in the site to be placed
            success = true;                             // assume a successful outcome
            while (success && x < comSize) {            // looking for an adjacent unused cell
                if (grid[location] == 0) {              // if already in use
                    coords[x++] = location;             // save lacation
                    location += incr;                   // try the "next" adjacent cell
                    if (location >= gridSize) {         // out of bounds - bottom
                        success = false;                // failure
                    }
                    if (x > 0 && (location % gridLength == 0)) { // out of bounds - right edge
                        success = false;                // failure
                    }
                } else {                                // found an already used location
//                    System.out.println("used" + location);
                    success = false;                    // failure
                }
            }
        }                                               // end of WHILE LOOP

        int x = 0;                                      // converting lacation to symbolic coordinates
        int row = 0;
        int column = 0;
//        System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;                        // mark cells on the main grid as "used"
            row = (int) (coords[x] / gridLength);       // get string value
            column = coords[x] % gridLength;            // get the numeric value of the column
            temp = String.valueOf(alphabet.charAt(column)); // convert it to a string character

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
//            System.out.println("   coord "+x+" = " + alphaCells.get(x - 1));
        }

//        System.out.println("\n");
        return alphaCells;
    }



}
