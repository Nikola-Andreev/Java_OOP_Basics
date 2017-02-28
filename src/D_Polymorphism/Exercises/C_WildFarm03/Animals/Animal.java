package D_Polymorphism.Exercises.C_WildFarm03.Animals;

import D_Polymorphism.Exercises.C_WildFarm03.Foods.Food;

public abstract class Animal {
    private String _name;
    private Double _weight;
    private int _foodEaten;

    Animal(String name, Double weight) {
        this.setName(name);
        this.setWeight(weight);
    }

    public String getName() {
        return this._name;
    }

    private void setName(String name) {
        this._name = name;
    }

    public Double getWeight() {
        return this._weight;
    }

    private void setWeight(Double weight) {
        this._weight = weight;
    }

    int getFoodEaten() {
        return this._foodEaten;
    }

    void setFoodEaten(int foodEaten) {
        this._foodEaten = foodEaten;
    }

    public void eat (Food f) {
        if (f.getClass().getSimpleName().equals("Meat")) {
            System.out.println(this.getClass().getSimpleName() + "s are not eating that type of food!");
            f.setQuantity(0);
        }
        this.setFoodEaten(f.getQuantity());
    }
}