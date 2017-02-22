package A_DefiningClasses.Exercises.E_SpeedRacing05;

import java.text.DecimalFormat;

public class Car {
    private String _model;
    private Double _fuelAmount;
    private Double _fuelCostPerKm;
    private Double _distanceTraveled;

    Car (String model, Double fuelAmount, Double fuelCostPerKm){
        this._model = model;
        this._fuelAmount = fuelAmount;
        this._fuelCostPerKm = fuelCostPerKm;
        this._distanceTraveled = 0.0;
    }

    public String getModel() {
        return this._model;
    }

    public Double getFuelAmount() {
        return this._fuelAmount;
    }

    public Double getFuelCostPerKm() {
        return this._fuelCostPerKm;
    }

    public Double getDistanceTraveled() {
        return this._distanceTraveled;
    }

    public boolean drive (double kilometers){
        double fuelNeeded = kilometers * this._fuelCostPerKm;
        if (this._fuelAmount >= fuelNeeded){
            this._fuelAmount -= fuelNeeded;
            this._distanceTraveled += kilometers;
            return true;
        }
        return false;
    }

    @Override
    public String toString () {
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df2 = new DecimalFormat("#.##");
        return this._model + " " + df.format(this._fuelAmount) + " " + df2.format(this._distanceTraveled);
    }
}
