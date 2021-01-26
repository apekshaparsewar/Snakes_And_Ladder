/**
 * 
 */
package Model;

/**
 * @author Apeksha Parsewar
 *
 */
public class Ladder {

    private int[] ladderStarts = { 4, 15, 22, 30, 38 };
    private int[] ladderEnds =   {14, 36, 42, 35, 42 };

    public int ladderPosition(int position)
    {
        for(int i = 0; i < ladderStarts.length ; i++ )
        {
            if(position == ladderStarts[i])
                return ladderEnds[i];
        }
        return position;
    }

    public boolean isLadder(int position)
    {
        for (int ladderStart : ladderStarts) {
            if (position == ladderStart)
                return true;
        }
        return false;
    }
}