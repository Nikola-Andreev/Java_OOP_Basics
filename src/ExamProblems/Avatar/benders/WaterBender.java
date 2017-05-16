package ExamProblems.Avatar.benders;

import java.text.DecimalFormat;

public class WaterBender extends Bender {

    private double waterClarity;

    public WaterBender(String name, long power, double waterClarity) {
        super(name, power);
        this.waterClarity  = waterClarity ;
    }

    @Override
    public double getTotalPower() {
        return super.getPower() * this.waterClarity;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Water Bender: " + super.getName() + ", Power: " + super.getPower() + ", Water Clarity: " + df.format(this.waterClarity);
    }
}
