/**
 * 
 */
package Model;

import java.util.Random;

/**
 * @author Apeksha Parsewar
 *
 */
public class simpleDice implements Dice{

    @Override
    public int rollDice() {
        return new Random().nextInt(6)+1;
    }
}