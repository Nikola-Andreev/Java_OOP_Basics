package D_Polymorphism.Exercises.C_WildFarm03.Animals;

import D_Polymorphism.Exercises.C_WildFarm03.Foods.Food;

public class Mouse extends Mammal{
    public Mouse(String name, Double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    public void makeSound () {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    public void eat (Food f) {
        if (f.getClass().getSimpleName().equals("Meat")) {
            System.out.println(this.getClass().getSimpleName() + "s are not eating that type of food!");
            f.setQuantity(0);
        } else {
            System.out.println("A cheese was just eaten!");
        }
        this.setFoodEaten(f.getQuantity());
    }
}
