package D_Polymorphism.Exercises.A_Vehicles01;

abstract class Vehicle {
    private final double FUEL_CONSUMPTION_INCREASE = this.getClass().getSimpleName().equals("Truck") ? 1.6 : 0.9;

    private double _fuelQuantity;
    private double _fuelConsumption;

    Vehicle(double fuelQuantity, double fuelConsumption) {
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
    }

    private double getFuelQuantity() {
        return this._fuelQuantity;
    }

    private void setFuelQuantity(double fuelQuantity) {
        this._fuelQuantity = fuelQuantity;
    }

    private double getFuelConsumption() {
        return this._fuelConsumption;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this._fuelConsumption = fuelConsumption;
    }

    void drive(double kilometers) {
        Double consumption = kilometers * (this.getFuelConsumption() + FUEL_CONSUMPTION_INCREASE);
        if (consumption > this.getFuelQuantity()) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " needs refueling");
        }
        this.setFuelQuantity(this.getFuelQuantity() - consumption);
    }

    void refuel(double liters) {
        final double finalLiters = this.getClass().getSimpleName().equals("Truck") ? liters -= liters * 0.05 : liters;
        this.setFuelQuantity(this.getFuelQuantity() + finalLiters);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}