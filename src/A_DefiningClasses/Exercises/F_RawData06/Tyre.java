package A_DefiningClasses.Exercises.F_RawData06;

public class Tyre {
    private double _pressure;
    private int _age;

    Tyre (double pressure, int age){
        this._pressure = pressure;
        this._age = age;
    }

    public double getPressure() {
        return this._pressure;
    }

    public int getAge() {
        return this._age;
    }
}
