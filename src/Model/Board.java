/**
 * 
 */
package Model;

/**
 * @author Apeksha Parsewar
 *
 */
public class Board {
    private static final int Board_size = 100;
    private int position;
    private int current_Position;
    Snakes snakes = new Snakes();
    Ladder ladders = new Ladder();

    public int movePlayer(int score) {
        position = current_Position + score;
        if (position > Board_size) {
            position = current_Position;
        } else {
            if (snakes.isSnake(position)) {
                position = snakes.snakePosition(position);
            } else if (ladders.isLadder(position)) {
                position = ladders.ladderPosition(position);
            }
        }
        current_Position = position;
        return position;
    }



    public boolean isGameOver(int tile)
    {
        if(tile == 100)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
