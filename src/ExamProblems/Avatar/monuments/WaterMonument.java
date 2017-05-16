package ExamProblems.Avatar.monuments;

public class WaterMonument extends Monument {

    private long waterAffinity;

    public WaterMonument(String name, long waterAffinity ) {
        super(name);
        this.waterAffinity = waterAffinity;
    }

    public long getWaterAffinity() {
        return this.waterAffinity;
    }

    @Override
    public String toString() {
        return "Water Monument: " + super.getName() + ", Water Affinity: " + this.waterAffinity;
    }
}
