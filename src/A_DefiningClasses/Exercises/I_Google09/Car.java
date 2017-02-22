package A_DefiningClasses.Exercises.I_Google09;

public class Car {
    private String _model;
    private String _speed;

    Car (String model, String speed){
        this._model = model;
        this._speed = speed;
    }

    @Override
    public String toString () {
        StringBuilder result = new StringBuilder();
        result.append("Car:").append("\n").append(this._model).append(" ").append(this._speed);
        if (this._model.equals("")){
            return "Car:";
        }
        return result.toString();
    }
}
