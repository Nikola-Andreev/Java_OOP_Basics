package A_DefiningClasses.Exercises.G_CarSaleman07;

public class Car {

    private String _model;
    private Engine _engine;
    private String _weight;
    private String _color;

    Car (String model, Engine engine) {
        this (model, engine, "n/a" ,"n/a");
    }

    Car (String model, Engine engine, int weight) {
        this (model, engine, weight + "" ,"n/a");
    }

    Car (String model, Engine engine, String color) {
        this (model, engine, "n/a" , color);
    }

    Car (String model, Engine engine, String weight, String color){
        this._model = model;
        this._engine = engine;
        this._weight = weight;
        this._color = color;
    }

    @Override
    public String toString (){
        StringBuilder sb = new StringBuilder("");
        sb.append(this._model).append(":\n  ");
        sb.append(this._engine.getModel()).append(":\n    ");
        sb.append("Power: ").append(this._engine.getPower()).append("\n    ");
        sb.append("Displacement: ").append(this._engine.getDisplacement()).append("\n    ");
        sb.append("Efficiency: ").append(this._engine.getEfficiency()).append("\n  ");
        sb.append("Weight: ").append(this._weight).append("\n  ");
        sb.append("Color: ").append(this._color);
        return sb.toString();
    }
}
