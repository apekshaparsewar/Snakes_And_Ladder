/**
 * 
 */
package Service;

/**
 * @author Apeksha Parsewar
 *
 */
import java.util.Scanner;

import Model.Board;
import Model.Dice;
import Model.crookedDice;
import Model.simpleDice;


public class Game
{
    private char type;
    Dice dice ;
    Board board = new Board();
    public void get_Player()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("WelCome To Snakes And Ladder Game");
        System.out.println("Enter player name");
        String name = scanner.next();
        System.out.println(name + ", Let's Start Game");
        System.out.println("press Enter to start");
        try{System.in.read();}
        catch(Exception e){}
    }
    public void getType()
    {
        System.out.println("Enter dice type");
        System.out.println("if you want to use crooked dice then enter 'c' \n" +
                " otherwise enter any key");
        Scanner scanner = new Scanner(System.in);
        type = scanner.next().charAt(0);
        if(type == 'c' || type == 'C')
        {
            dice = new crookedDice();
        }
        else
        {
            dice = new simpleDice();
        }
    }
    public void Start()
    {
        int score;
        get_Player();
        getType();
       // board.movePlayer(score);
        int p;
        do
        {
            score = dice.rollDice();
            System.out.println("dice value"+score);
            p = board.movePlayer(score);
            System.out.println("position"+p);
        }while(board.isGameOver(p) == false);
    }
}
