package A_DefiningClasses.Exercises.I_Google09;

public class Pokemon {
    private String _name;
    private String _type;

    Pokemon (String name, String type) {
        this._name = name;
        this._type = type;
    }

    @Override
    public String toString () {
        return this._name + " " + this._type + "\n";
    }
}
