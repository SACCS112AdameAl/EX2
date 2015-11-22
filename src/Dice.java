import javax.swing.JOptionPane;

public class Dice {

	private String range = null;
	private String response;
	private int diceRoll;
	private int gameWins = 0;

	public int GetNumber()
	{
		diceRoll = 1 + (int) ( Math.random() * (6) );
		return diceRoll;
	}

	public int NumberofDices(int nDices)
	{
		if (nDices == 1)
		{
			diceRoll = 1 + (int) ( Math.random() * (6) );

		}
		if (nDices == 2)
		{
			diceRoll = 2 + (int) ( Math.random() * (12) );


		}
		if (nDices == 3)
		{
			diceRoll = 3 + (int) ( Math.random() * (18) );

		}
		return diceRoll;
	}

	public int GuessRange(String range, String myChoice )
	{		

		if (myChoice.equals(range))
		{
			response = JOptionPane.showInputDialog(null, String.format("The number was: %d. You've guessed correctly!", diceRoll));
			gameWins++;
		}
		else if(!(myChoice.equals(range)))
		{
			response = JOptionPane.showInputDialog(null,String.format("Sorry, the number was: %d. You've guessed incorrectly!", diceRoll));
			gameWins--;
		}
		return gameWins;

	}

	public String SetRange(int diceRange, int nDices)
	{	
		if (nDices == 1 )
		{
			if (diceRoll >= 1 && diceRoll <= 3 )
			{
				range = "low"; 
			}
			if (diceRoll >= 4 && diceRoll <= 6 )
			{
				range = "high"; 
			}
		}

		if (nDices == 2 )
		{
			if (diceRoll >= 2 && diceRoll <= 6 )
			{
				range = "low"; 
			}
			if (diceRoll >= 7 && diceRoll <= 12 )
			{
				range = "high"; 
			}
		}

		if (nDices == 3 ){
			if (diceRoll >= 3 && diceRoll <= 9 )
			{
				range = "low"; 
			}
			if (diceRoll >= 10 && diceRoll <= 18 )
			{
				range = "high"; 
			}
		}
		return range;
	}	
}