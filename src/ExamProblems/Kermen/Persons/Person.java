package ExamProblems.Kermen.Persons;

public abstract class Person {
    private double income;

    public Person(double income) {
        this.setIncome(income);
    }

    public double getIncome() {
        return this.income;
    }

    private void setIncome(double income) {
        this.income = income;
    }

    public abstract Double getCosts();
}
