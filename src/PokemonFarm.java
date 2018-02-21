import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}
	
	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}
	
//	public void feed(String item){
	 	
//	}
	public String getName(int i) {
		return pokemons.get(i).getName();
	}
	
	public void list(){
		if(pokemons.size() == 0) {
			System.out.println("There is no pokemon in the farm.");
		}
		for(int i =0;i<pokemons.size();i++){
			pokemons.get(i).print();
		}
	}

	public void feed(String pokemonName,String item){
		int i;
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat(item);
			}
		}else {
			for(i=0;i<pokemons.size();i++) {
				if(pokemonName.equals(pokemons.get(i).getName())) {
					break;
				}else if(i == pokemons.size()-1) {
					System.out.println("There is no pokemon with that name.");
					return ;
				}
			}
			pokemons.get(i).eat(item);
			
		}
	}
	public int getsize() {
		return pokemons.size();
	}
}
