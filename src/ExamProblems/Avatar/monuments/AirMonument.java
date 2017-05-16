package ExamProblems.Avatar.monuments;

public class AirMonument extends Monument {

    private long airAffinity;

    public AirMonument(String name, long airAffinity ) {
        super(name);
        this.airAffinity = airAffinity;
    }

    public long getAirAffinity() {
        return this.airAffinity;
    }

    @Override
    public String toString() {
        return "Air Monument: " + super.getName() + ", Air Affinity: " + this.airAffinity;
    }
}
