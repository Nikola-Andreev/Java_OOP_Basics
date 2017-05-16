package ExamProblems.Avatar.benders;

public abstract class Bender {

    private String name;
    private long power;

    Bender(String name, long power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return this.name;
    }

    public abstract double getTotalPower();

    long getPower() {
        return this.power;
    }
}
