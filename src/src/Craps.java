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
			//Initial (Start of the Game)
			System.out.println("Welcome to Craps. Press enter to Roll");
			Scanner in = new Scanner(System.in);
		    in.nextLine();
		    
		    //Variable Setup
		    Dice dice1 = new Dice();
		    Dice dice2 = new Dice();
		    int roll1 = dice1.roll();
		    int roll2 = dice2.roll();
		    int sum = roll1 + roll2;
		    
		    //Printout
		    System.out.println("Dice 1: " +roll1 );
		    System.out.println("Dice 2: " + roll2);
		    System.out.println("Sum: " + sum);
		   
		    //If win
		    if(sum == 7 || sum == 11)
		    {
		    	System.out.println("You Win. Would you like to play again?");
		    	String response = in.nextLine();
		    	
		    	//User Input to replay
		    	while (!response.equals("Yes") && !response.equals("yes") && !response.equals("No") && !response.equals("no"))		{
		    		System.out.println("Please try again. Would you like to play again?");
		    		response = in.nextLine();
		    			}
		    	if(response.equals("Yes") || response.equals("yes"))
		    	{
		    		play = true;
		    	}
		    	else if(response.equals("No")|| response.equals("no"))
		    	{
		    		play = false;
		    	}
		    	
		    }
		    //If lose
		    else if(sum == 2 || sum == 12)
		    {
		    	System.out.println("You Lose. Would you like to play again?");
		    	String response = in.nextLine();
		    	
		    	//User Input to Replay
		    	while (!response.equals("Yes") && !response.equals("yes") && !response.equals("No") && !response.equals("no"))
    			{
    		System.out.println("Please try again. Would you like to play again?");
    		response = in.nextLine();
    			}
		    	if(response.equals("Yes") || response.equals("yes"))
		    	{
		    		play = true;
		    	}
		    	else if(response.equals("No")|| response.equals("no"))
		    	{
		    		play = false;
		    	}
		    }
		    //If neither win or lose
		    else
		    {
		    	 int point = sum; //Infinite rolls
		    	while (sum != point || sum != 7)
		    	{
		    		System.out.println("Press Enter to roll again.");
				    in.nextLine();
				     roll1 = dice1.roll();
				    roll2 = dice2.roll();
				    sum = roll1 + roll2;
				    
				    System.out.println("Dice 1: " +roll1 );
				    System.out.println("Dice 2: " + roll2);
				    System.out.println("Sum: " + sum);
		    	
		    	//If win
				    if (sum == point)
		    	{
		    		System.out.println("You win. Would you like to play again?");
		    		break;
		    	}
				    //If lose
		    	else if(sum == 7)
		    	{
		    		System.out.println("You lose. Would you like to play again?");
		    		break;
		    	}
		    	}
		    }
		    //USer input for Replayability
		    String response = in.nextLine();
		    
		    while (!response.equals("Yes") && !response.equals("yes") && !response.equals("No") && !response.equals("no"))
			{
		System.out.println("Please try again. Would you like to play again?");
		response = in.nextLine();
			}
	    	if(response.equals("Yes") || response.equals("yes"))
	    	{
	    		play = true;
	    	}
	    	else if(response.equals("No")|| response.equals("no"))
	    	{
	    		play = false;
	    	}
		}
	}
}