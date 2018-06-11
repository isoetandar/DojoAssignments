
public class Pokedex extends AbstractPokemon{

	public void pokemonInfo(Pokemon pokemon) {
		System.out.println(pokemon.getName() + " has " + pokemon.getHealth() + " health and is a " + pokemon.getType() + " type Pokemon");
	}
	
}
