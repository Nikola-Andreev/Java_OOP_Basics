package D_Polymorphism.Exercises.B_VehiclesExtension02;

abstract class Vehicle {
    private final double FUEL_CONSUMPTION_INCREASE = this.getClass().getSimpleName().equals("Truck") ? 1.6 : 0.9;
    private static final int INITIAL_FUEL_QUANTITY = 0;

    private double _fuelQuantity;
    private double _fuelConsumption;
    private double _tankCapacity;

    Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.setInitialFuelQuantity(INITIAL_FUEL_QUANTITY);
        this.setTankCapacity(tankCapacity);
        this.setFuelQuantity(fuelQuantity);
        this.setFuelConsumption(fuelConsumption);
    }

    private double getTankCapacity() {
        return this._tankCapacity;
    }

    private void setTankCapacity(double tankCapacity) {
        this._tankCapacity = tankCapacity;
    }

    double getFuelQuantity() {
        return this._fuelQuantity;
    }

    private void setInitialFuelQuantity(int initialFuelQuantity) {
        this._fuelQuantity = initialFuelQuantity;
    }

    void setFuelQuantity(double fuelQuantity) {
        if (fuelQuantity < 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if (this.getClass().getSimpleName().equals("Car") || this.getClass().getSimpleName().equals("Bus")){
            if (this.getTankCapacity() < fuelQuantity + this.getFuelQuantity()){
                throw new IllegalArgumentException("Cannot fit fuel in tank");
            }
        }
        this._fuelQuantity = fuelQuantity;
    }

    double getFuelConsumption() {
        return this._fuelConsumption;
    }

    private void setFuelConsumption(double fuelConsumption) {
        this._fuelConsumption = fuelConsumption;
    }

    void drive(double kilometers) {
        double busFuelConsumptionIncrease = 1.4;
        double increase = this.getClass().getSimpleName().equals("Bus") ? busFuelConsumptionIncrease : FUEL_CONSUMPTION_INCREASE;
        Double consumption = kilometers * (this.getFuelConsumption() + increase);
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