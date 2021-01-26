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
        int p;
        do
        {
        	System.out.println("Your Turn!!");
        	try{System.in.read();}
            catch(Exception e){}
            score = dice.rollDice();
            System.out.println("Your Score :"+score);
            p = board.movePlayer(score);
            System.out.println("\nYou are on "+p+"th positon.");
        }while(board.isGameOver(p) == false);
        
        System.out.println("Congratulations!!! you won the game");
    }
}
