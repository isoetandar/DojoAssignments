public class PokemonTest extends Pokedex{
    public static void main(String[] args){
        Pokedex pokedex = new Pokedex();
        Pokemon charmander = pokedex.createPokemon("Charmander",100,"Fire");
        Pokemon pikachu = pokedex.createPokemon("Pikachu",50,"Electric");

        pokedex.attackPokemon(charmander);
        pokedex.pokemonInfo(charmander);
        pokedex.pokemonInfo(pikachu);
        
    }
}