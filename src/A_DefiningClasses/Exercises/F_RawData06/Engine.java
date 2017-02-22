package A_DefiningClasses.Exercises.F_RawData06;

public class Engine {
    private int _speed;
    private int _power;

    Engine(int speed, int power){
        this._speed = speed;
        this._power = power;
    }

    public int getSpeed() {
        return this._speed;
    }

    public int getPower() {
        return this._power;
    }
}
