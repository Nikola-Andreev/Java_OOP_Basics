package ExamProblems.Avatar.monuments;

public abstract class Monument {

    private String name;

    Monument(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
