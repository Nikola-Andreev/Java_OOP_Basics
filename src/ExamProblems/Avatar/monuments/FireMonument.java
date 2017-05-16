package ExamProblems.Avatar.monuments;

public class FireMonument extends Monument {

    private long fireAffinity;

    public FireMonument(String name, long fireAffinity ) {
        super(name);
        this.fireAffinity = fireAffinity;
    }

    public long getFireAffinity() {
        return this.fireAffinity;
    }

    @Override
    public String toString() {
        return "Fire Monument: " + super.getName() + ", Fire Affinity: " + this.fireAffinity;
    }
}
