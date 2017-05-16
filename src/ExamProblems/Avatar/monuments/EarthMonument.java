package ExamProblems.Avatar.monuments;

public class EarthMonument extends Monument {

    private long earthAffinity;

    public EarthMonument(String name, long earthAffinity ) {
        super(name);
        this.earthAffinity = earthAffinity;
    }

    public long getEarthAffinity() {
        return this.earthAffinity;
    }

    @Override
    public String toString() {
        return "Earth Monument: " + super.getName() + ", Earth Affinity: " + this.earthAffinity;
    }
}
