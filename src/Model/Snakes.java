/**
 * 
 */
package Model;

/**
 * @author Apeksha Parsewar
 *
 */
public class Snakes {

    private int[] snakeStarts = {47, 34, 25, 18, 12 };
    private int[] snakeEnds =   {20, 24, 17,  8, 5  };

    public int snakePosition(int position)
    {
        for(int i = 0; i < snakeStarts.length ; i++ )
        {
            if(position == snakeStarts[i])
                return snakeEnds[i];
        }
        return position;
    }

    public boolean isSnake(int position)
    {
        for (int snakeStart : snakeStarts) {
            if (position == snakeStart)
                return true;
        }
        return false;
    }

}
