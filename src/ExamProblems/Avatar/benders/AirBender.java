package ExamProblems.Avatar.benders;

import java.text.DecimalFormat;

public class AirBender extends Bender {

    private double aerialIntegrity;

    public AirBender(String name, long power, double aerialIntegrity) {
        super(name, power);
        this.aerialIntegrity = aerialIntegrity;
    }

    @Override
    public double getTotalPower() {
        return super.getPower() * this.aerialIntegrity ;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Air Bender: " + super.getName() + ", Power: " + super.getPower() + ", Aerial Integrity: " + df.format(this.aerialIntegrity);
    }
}
