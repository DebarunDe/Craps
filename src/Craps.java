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
		Scanner in = new Scanner(System.in);
		Dice Dice1 = new Dice();
		Dice Dice2 = new Dice();
		
		//Initial Ask
		System.out.println("Hello, Would you like to play? Type Yes or No");
		String choice1 = in.next();
		String answer1 = "Yes";
		String answer2 = "No";
		in.nextLine();
		
		//If Neither Choice selected
		while(!choice1.equals(answer1) && !choice1.equals(answer2))
		{
			System.out.println("Hello, Would you like to play?  Yes or No");
			choice1 = in.next();
			in.nextLine();
		}
		
		//Yes Choice	
			if(choice1.equals(answer1))
			{
				//Initial Roll
				System.out.println("Hit Enter to Roll");
				in.nextLine();
				
				int roll1 = Dice1.roll();
				int roll2 = Dice2.roll();
				int sum = roll1 + roll2;
				
				System.out.println("Dice 1 " + roll1);
				System.out.println("Dice 2 : " + roll2);
				System.out.println("Sum: " + sum);
				
				//Determine Win Or Lose
				if(sum == 7 || sum == 11)
				{
					System.out.println("You Win");
				}
				
				else if(sum == 2 || sum == 12)
				{
					System.out.println("You Lose");
				}
				
				else 
				{
					while(sum != 2 && sum != 7 && sum !=11 && sum != 12)
					{
						System.out.println("Press Enter to Roll Again");
					}
				}
			}
		
			//If No
			else if(choice1.equals(answer2))
		{
			System.out.println("Oof");
		}
		
		
		
			
		
	
	 
	}
}
