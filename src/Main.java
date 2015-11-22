import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)

	{

		String doAgain;
		Dice tDice = new Dice();
		int gameCount = 0;
		int winGame;
		do{
			
			Scanner myKeyboard = new Scanner(System.in);
			int nDices = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dices: "));
			int test = tDice.NumberofDices(nDices);
			String range = tDice.SetRange(test, nDices);
			String myChoice = (JOptionPane.showInputDialog(null, "Try to guess the range, either low or high: "));
			winGame = tDice.GuessRange(range, myChoice);

			doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();
			while(!(doAgain.matches("[YN]+"))) 
			{				
				JOptionPane.showMessageDialog(null, "Error: Invalid choice.");
				doAgain = JOptionPane.showInputDialog("Do it again? (Y/N)").toUpperCase();
			}
		}while (!(doAgain.equals("N")));
	
		JOptionPane.showMessageDialog(null,"GoodBye!");
		JOptionPane.showMessageDialog(null, "Your Score: " + winGame);
	}

}