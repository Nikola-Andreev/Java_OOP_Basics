package ExamProblems.Avatar.benders;

import java.text.DecimalFormat;

public class EarthBender extends Bender {

    private double groundSaturation;

    public EarthBender(String name, long power, double groundSaturation) {
        super(name, power);
        this.groundSaturation  = groundSaturation ;
    }

    @Override
    public double getTotalPower() {
        return super.getPower() * this.groundSaturation;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Earth Bender: " + super.getName() + ", Power: " + super.getPower() + ", Ground Saturation: " + df.format(this.groundSaturation);
    }
}
