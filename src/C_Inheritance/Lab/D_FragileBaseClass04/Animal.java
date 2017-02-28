package C_Inheritance.Lab.D_FragileBaseClass04;

import D_Polymorphism.Exercises.C_WildFarm03.Foods.Food;

import java.util.ArrayList;
import java.util.Collections;

public class Animal {
    private ArrayList<Food> foodEaten;

    public Animal() {
        this.setFoodEaten(new ArrayList<>());
    }

    private void setFoodEaten(ArrayList<Food> foodEaten) {
        this.foodEaten = foodEaten;
    }

    public final void eat(Food f) {
        foodEaten.add(f);
    }

    public final void eatAll(Food[] foods) {
        Collections.addAll(foodEaten, foods);
    }
}
