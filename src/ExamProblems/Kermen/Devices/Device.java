package ExamProblems.Kermen.Devices;

public abstract class Device {
    private double cost;

    Device(double electricityCost) {
        this.setCost(electricityCost);
    }

    public double getCost() {
        return this.cost;
    }

    private void setCost(double cost) {
        this.cost = cost;
    }
}
