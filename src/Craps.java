/**
 * 
 * @author dde19
 * Debarun De
 * Craps
 * pd. 6
 *
 */
import java.util.*;
public class Craps {
	
	public static void main(String[] args) 
	{
		boolean play = true;
		while(play)
		{
			System.out.println("Welcome to Craps. Press enter to Roll");
			Scanner in = new Scanner(System.in);
		    in.nextLine();
		    
		    Dice dice1 = new Dice();
		    Dice dice2 = new Dice();
		    int roll1 = dice1.roll();
		    int roll2 = dice2.roll();
		    int sum = roll1 + roll2;
		    
		    System.out.println("Dice 1: " +roll1 );
		    System.out.println("Dice 2: " + roll2);
		    System.out.println("Sum: " + sum);
		    
		    if(sum == 7 || sum == 11)
		    {
		    	System.out.println("You Win. Type Yes to play again");
		    }
		}
	}
}