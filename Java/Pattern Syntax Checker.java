import java.util.Random;
import java.util.Scanner;    //to use the random number generator

public class Ct {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
	
	
	
		final int NUMBER = 100;
		Random generator = new Random();
		int count = 0; 
		int guess;
		
		do
		{
			System.out.println("Enter a guess between 1 to 100");
			guess = Keyboard.nextInt();
		}while (guess < 1 || guess > 100);
		
		int randomNumber = generator.nextInt(NUMBER)+1;
		
		while(guess != randomNumber)
		{
			count++;
			if(guess > randomNumber)
				//output response
				System.out.println("output response too high. " + "Enter number again");
			else if(guess < randomNumber)
				//output response
			System.out.println("Output response too low. " + "Enter number again");
			guess = Keyboard.nextInt();


		}
		}

}
