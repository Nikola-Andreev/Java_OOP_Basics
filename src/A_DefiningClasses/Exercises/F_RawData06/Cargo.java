package A_DefiningClasses.Exercises.F_RawData06;

public class Cargo {
    private int _weight;
    private String _type;

    Cargo(int weight, String type){
        this._weight = weight;
        this._type = type;
    }

    public int getWeight() {
        return this._weight;
    }

    public String getType() {
        return this._type;
    }
}
