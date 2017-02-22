package A_DefiningClasses.Exercises.I_Google09;

public class Children {
    private String _name;
    private String _birthday;

    Children (String name, String birthday) {
        this._name = name;
        this._birthday = birthday;
    }

    @Override
    public String toString () {
        return this._name + " " + this._birthday + "\n";
    }
}
