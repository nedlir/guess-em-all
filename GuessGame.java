import java.util.Scanner;

public class GuessGame {
	private Pokemon randomPokemon; // The word for the user to guess.
	private Alphabet unusedLetters; // Letters the user still didn't use as a guess.
	private Scanner input;

	public GuessGame(Scanner input) {
		this.input = input;
		printRules();
	}

	/*
	 * Runs a game.
	 */
	public void startNewGame() {
		// Variable initialization:
		unusedLetters = new Alphabet();

		randomPokemon = new Pokemon();

		String word = randomPokemon.getPokemonName().toLowerCase(); // The word the user needs to guess.

		String userGuess; // String which serves as a container for user input.

		char[] userGuessWord = new char[word.length()]; // String representing user guess.
		initCharArray(userGuessWord, '_');

		boolean isPlay = true; // Flag to determine playing status.

		int guessAttempts = 0; // Counter for guess attempts.


		// Game loop. The game will continue until the word is found.
		while (isPlay) {
			// Word to guess found:
			if (String.valueOf(userGuessWord).equals(word))
				break;

			System.out.println("The letters you have deciphered so far: " + String.valueOf(userGuessWord) + "("
					+ userGuessWord.length + " letters)");
			System.out.println("Current unused letters are: ");
			unusedLetters.print();
			System.out.println();
			System.out.println("Please type a character:");

			userGuess = input.next().toLowerCase(); // user guessed letter scanned in lower case format

			if (!isValidInput(userGuess)) {
				System.out.print("Whooops! It seems like your input is invalid. (╯•ᗣ•╰)");
				System.out.println("Please type a single valid alphabet letter.");
			}

			else // Input is a valid alphabet character.
			{
				unusedLetters.remove(userGuess.charAt(0)); // Remove the user guessed letter from the unused letters

				if (word.contains(userGuess)) {
					System.out.println("Yay! " + "\'" + userGuess + "\'" + " appears in the word");
					insertCharArray(word, userGuessWord, userGuess.charAt(0)); // inserts the letter into the word
				}

				else {
					System.out
							.println("Seems like " + "\'" + userGuess + "\'" + " is not in the word, keep on trying!");
				}
			}

			guessAttempts++;
		}
		System.out.println("Congratulations! You have found the correct word: " + capitalizedString(word));
		System.out.println("Total attempts: " + guessAttempts);
	}

	/*
	 * Prints the game rules.
	 */
	private void printRules() {
		System.out.println("Welcome to the Pokemon guessing game! (◕‿◕)");
		System.out.println(
				"The computer will randomly choose a pokemon name. For simplicity's sake, we will use only first generation's 151 pokemon.");
		System.out.println("The goal of the game is to guess correctly the name which was randomly chosen.");
		System.out.println(
				"If the guessed letter exists in the pokemon's name, it will be marked in all the correct spots within the word.");
		System.out.println("Guessing will continue until the word is guessed completely.");
		System.out.println("Valid input is only a single alphabet letter. For example: 'Q' or 'q'.");
		System.out.println("Gotta guess 'em all! (╯°□°)╯︵◓");
	}

	/*
	 * Checks whether a given input is valid.
	 */
	private boolean isValidInput(String letter) {
		// Only a single char should be inserted.
		if (letter.length() > 1)
			return false;

		// At least a single character must be guessed.
		if (letter.length() < 1)
			return false;

		// The character given is not a valid alphabet letter.
		if (!Alphabet.LOWERCASE.contains(letter))
			return false;

		// if input is valid:
		return true;
	}

	/*
	 * Initializes char array with given value.
	 */
	private void initCharArray(char[] array, char initValue) {
		for (int i = 0; i < array.length; i++)
			array[i] = initValue;
	}

	/*
	 * Inserts given value into all places where it appears.
	 */
	private void insertCharArray(String origin, char[] destination, char insertValue) {
		for (int i = 0; i < destination.length; i++)
			if (origin.charAt(i) == insertValue)
				destination[i] = insertValue;
	}

	/*
	 * Returns a string with first letter capitalized.
	 */
	private String capitalizedString(String pokemonName) {
		if (pokemonName == null || pokemonName.isEmpty())
			return pokemonName;

		return pokemonName.substring(0, 1).toUpperCase() + pokemonName.substring(1);
	}

}
