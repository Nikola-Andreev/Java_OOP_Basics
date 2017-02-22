package A_DefiningClasses.Exercises.H_PokemonTrainer08;

import java.util.LinkedList;

public class Trainer {

    private String _name;
    private int _numberOfBadges;
    LinkedList<Pokemon> _pokemonCollection;

    Trainer (String name) {
        this._name = name;
        this._numberOfBadges = 0;
        this._pokemonCollection = new LinkedList<>();
    }

    public void adPokemon (Pokemon pokemon) {
        this._pokemonCollection.add(pokemon);
    }

    public boolean checkForElement (String element) {
        for (int i = 0; i < this._pokemonCollection.size(); i++) {
            if (_pokemonCollection.get(i).getElement().equals(element)) {
                return true;
            }
        }
        return false;
    }

    public void adBadge(){
        this._numberOfBadges++;
    }

    public void increaseHealth(){
        LinkedList<Integer> pokemonsForRemove = new LinkedList<>();
        for (int i = 0; i < _pokemonCollection.size(); i++) {
            if (_pokemonCollection.get(i).getHealth() - 10 <= 0) {
                pokemonsForRemove.add(i);
            } else {
                _pokemonCollection.get(i).increaseHealth();
            }
        }
        this.removePokemons(pokemonsForRemove);
    }

    private void removePokemons (LinkedList<Integer> pokemonIndexes) {
        for (int i = pokemonIndexes.size()-1; i >= 0; i--) {
            _pokemonCollection.remove((int)pokemonIndexes.get(i));
        }
    }

    public int getNumberOfBadges() {
        return this._numberOfBadges;
    }

    @Override
    public String toString() {
        return this._name + " " + this._numberOfBadges + " " + this._pokemonCollection.size();
    }
}
