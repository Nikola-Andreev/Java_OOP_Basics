package A_DefiningClasses.Exercises.F_RawData06;

public class Car {
    private String _model;
    private Engine _engine;
    private Cargo _cargo;
    private Tyre[] _tyres;

    Car (String model, Engine engine, Cargo cargo, Tyre[] tyres) {
        if (tyres.length == 4){
            this._model = model;
            this._engine = engine;
            this._cargo = cargo;
            this._tyres = tyres;
        } else {
            System.out.println("Incorrect number of tyres!");
        }
    }

    public String getModel() {
        return this._model;
    }

    public Engine getEngine() {
        return this._engine;
    }

    public Cargo getCargo() {
        return this._cargo;
    }

    public Tyre[] getTyres() {
        return this._tyres;
    }

    public boolean checkTyresPressure() {
        for (Tyre _tyre : _tyres) {
            if (_tyre.getPressure() < 1) {
                return true;
            }
        }
        return false;
    }
}
