package ExamProblems.PawInc.Animals;

import ExamProblems.PawInc.Centers.AdoptionCenter;

public class Cat extends Animal{
    private int intelligenceCoefficient;

    public Cat(String name, int age, int intelligenceCoefficient, AdoptionCenter a) {
        super(name, age, a);
        this.setIntelligenceCoefficient(intelligenceCoefficient);
    }

    public final int getIntelligenceCoefficient() {
        return this.intelligenceCoefficient;
    }

    private void setIntelligenceCoefficient(int intelligenceCoefficient) {
        this.intelligenceCoefficient = intelligenceCoefficient;
    }
}
