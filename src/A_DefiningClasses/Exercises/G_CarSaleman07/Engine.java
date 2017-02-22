package A_DefiningClasses.Exercises.G_CarSaleman07;

public class Engine {

    private String _model;
    private Integer _power;
    private String _displacement;
    private String _efficiency;

    Engine (String model, int power) {
        this (model, power, "n/a" ,"n/a");
    }

    Engine (String model, int power, int displacement) {
        this (model, power, displacement + "" ,"n/a");
    }

    Engine (String model, int power, String efficiency) {
        this (model, power, "n/a" ,efficiency);
    }

    Engine (String model, int power, String displacement, String efficiency){
        this._model = model;
        this._power = power;
        this._displacement = displacement;
        this._efficiency = efficiency;
    }

    public String getModel() {
        return this._model;
    }

    public Integer getPower() {
        return this._power;
    }

    public String getDisplacement() {
        return this._displacement;
    }

    public String getEfficiency() {
        return this._efficiency;
    }
}