package ExamProblems.Kermen.Persons;

import ExamProblems.Kermen.Devices.Food;
import ExamProblems.Kermen.Devices.Toy;

import java.util.ArrayList;

public class Child extends Person{
    private Food childFood;
    private ArrayList<Toy> childToys;

    public Child(Food f, ArrayList<Toy> toys) {
        super(0);
        this.setChildFood(f);
        this.setChildToys(toys);
    }

    private Food getChildFood() {
        return this.childFood;
    }

    private void setChildFood(Food childFood) {
        this.childFood = childFood;
    }

    private ArrayList<Toy> getChildToys() {
        return this.childToys;
    }

    private void setChildToys(ArrayList<Toy> childToys) {
        this.childToys = childToys;
    }

    public Double getCosts() {
        final Double[] childCosts = {this.getChildFood().getCost()};
        this.getChildToys().forEach(toy -> childCosts[0] += toy.getCost());
        return childCosts[0];
    }
}
