package ExamProblems.SystemSplit;

public abstract class Systems {
    private String name;
    private String type;

    public Systems(String name, String type) {
        this.setName(name);
        this.setType(type);
    }

    public final String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public final String getType() {
        return this.type;
    }

    private void setType(String type) {
        this.type = type;
    }
}
