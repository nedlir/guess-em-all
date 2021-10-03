import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // assigns a new Scanner for the GuessGame.

		GuessGame g1 = new GuessGame(input);

		while (isPlay(input)) 
			g1.startNewGame();

		input.close();
		System.out.println("Thank you for playing (＾◡＾)");

	}


	private static boolean isPlay(Scanner input) {
		String playInstruction; // stores instruction from user.

		// Decide if to play another game:
		System.out.println("Type 'Yes' or 'Y' to start a new Guessing Game.");
		System.out.println("Any other input will finish the game.");

		playInstruction = input.next().toLowerCase();
		if (playInstruction.equals("y") || playInstruction.equals("yes"))
			return true;
		else
			return false;
	}
}
