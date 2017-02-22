package A_DefiningClasses.Exercises.H_PokemonTrainer08;

public class Pokemon {

    private String _name;
    private String _element;
    private int _health;

    Pokemon (String name, String element, int health) {
        this._name = name;
        this._element = element;
        this._health = health;
    }

    public String getElement() {
        return this._element;
    }

    public int getHealth() {
        return this._health;
    }

    public void increaseHealth() {
        this._health -= 10;
    }
}
