package ExamProblems.PawInc.Animals;

import ExamProblems.PawInc.Centers.AdoptionCenter;

public class Dog extends Animal{
    private int amountOfCommands;

    public Dog(String name, int age, int amountOfCommands, AdoptionCenter a) {
        super(name, age, a);
        this.setAmountOfCommands(amountOfCommands);
    }

    public final int getAmountOfCommands() {
        return this.amountOfCommands;
    }

    private void setAmountOfCommands(int amountOfCommands) {
        this.amountOfCommands = amountOfCommands;
    }
}
