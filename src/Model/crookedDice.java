/**
 * @author Apeksha Parsewar
 *
 */
package Model;

import java.util.Random;

public class crookedDice implements Dice {

    public int rollDice()
    {
        Random r1;
        r1 = new Random();

        return r1.nextInt(12/2)*2 +2;

    }

}

