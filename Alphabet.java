import java.util.HashSet;

public class Alphabet {

	public final static String LOWERCASE = "abcdefghijklmnnopqrstuvwxyz";
	private HashSet<Character> alphabet = new HashSet<Character>();

	public Alphabet() {
		// Adds alphabet letters to an array list.
		for (int i = 0; i < LOWERCASE.length(); i++)
			alphabet.add(LOWERCASE.charAt(i));
	}

	public void print() {
		System.out.print(alphabet);
	}

	public void remove(char character){
		alphabet.remove(character);
	}
}