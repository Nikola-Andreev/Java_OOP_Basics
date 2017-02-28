package D_Polymorphism.Exercises.C_WildFarm03.Animals;

import D_Polymorphism.Exercises.C_WildFarm03.Foods.Food;

import java.text.DecimalFormat;

public class Cat extends Felime{
    private String _breed;

    public Cat(String name, Double weight, String livingRegion, String breed) {
        super(name, weight, livingRegion);
        this.setBreed(breed);
    }

    private String getBreed() {
        return this._breed;
    }

    private void setBreed(String breed) {
        this._breed = breed;
    }

    public void makeSound () {
        System.out.println("Meowwww");
    }

    @Override
    public void eat (Food f) {
        this.setFoodEaten(f.getQuantity());
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.####################");
        return this.getClass().getSimpleName() + "[" + this.getName() + ", " + this.getBreed() + ", " +
                df.format(this.getWeight()) + ", " + this.getLivingRegion() +", " + this.getFoodEaten() + "]";
    }
}
