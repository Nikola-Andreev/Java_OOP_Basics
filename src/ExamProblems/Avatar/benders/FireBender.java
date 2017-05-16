package ExamProblems.Avatar.benders;

import java.text.DecimalFormat;

public class FireBender extends Bender {

    private double heatAggression;

    public FireBender(String name, long power, double heatAggression) {
        super(name, power);
        this.heatAggression  = heatAggression ;
    }

    @Override
    public double getTotalPower() {
        return super.getPower() * this.heatAggression;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Fire Bender: " + super.getName() + ", Power: " + super.getPower() + ", Heat Aggression: " + df.format(this.heatAggression);
    }
}
