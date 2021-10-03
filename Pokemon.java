import java.util.Random;
/*
 * To make things a bit more interesting I decided to make the guessing game a pokemon names based game. 
 * The names were simply scraped from wikipedia.
 */
public class Pokemon {

	private String pokemonName;

	// 1st Generation, 151 pokemon names list:
	private String pokemonNamesList[] = 
		{ 
			"Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
			"Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree", "Weedle", "Kakuna", "Beedrill",
			"Pidgey", "Pidgeotto", "Pidgeot", "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok", "Pikachu",
			"Raichu", "Sandshrew", "Sandslash", "Nidoran", "Nidorina", "Nidoqueen", "Nidoran ♂", "Nidorino",
			"Nidoking", "Clefairy", "Clefable", "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat",
			"Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat", "Venomoth", "Diglett", "Dugtrio", "Meowth",
			"Persian", "Psyduck", "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag", "Poliwhirl",
			"Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop", "Machoke", "Machamp", "Bellsprout", "Weepinbell",
			"Victreebel", "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash", "Slowpoke",
			"Slowbro", "Magnemite", "Magneton", "Farfetchd", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer", "Muk",
			"Shellder", "Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee", "Hypno", "Krabby", "Kingler",
			"Voltorb", "Electrode", "Exeggcute", "Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan",
			"Lickitung", "Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela", "Kangaskhan", "Horsea",
			"Seadra", "Goldeen", "Seaking", "Staryu", "Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar",
			"Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto", "Eevee", "Vaporeon", "Jolteon", "Flareon",
			"Porygon", "Omanyte", "Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos",
			"Moltres", "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew" 
		};

	/*
	 * Constructor for the pokemon class. Randomizes a name out of the given pokemon
	 * list.
	 */
	public Pokemon() {
		// Sets a random pokemon name.
		int pokemonNumber = this.getRandomNumber();
		this.pokemonName = pokemonNamesList[pokemonNumber];
	}

	/*
	 * Returns a random pokemon value number.
	 */
	private int getRandomNumber() {
		Random randomizer = new Random(); // randomizer instantation
		return randomizer.nextInt(pokemonNamesList.length);
	}

	public String getPokemonName() {
		return this.pokemonName;
	}

}
