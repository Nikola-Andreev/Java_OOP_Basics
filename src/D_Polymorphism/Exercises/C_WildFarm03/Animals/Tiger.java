package D_Polymorphism.Exercises.C_WildFarm03.Animals;

import D_Polymorphism.Exercises.C_WildFarm03.Foods.Food;

public class Tiger extends  Felime{
    public Tiger(String name, Double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    public void makeSound () {
        System.out.println("ROAAR!!!");
    }

    @Override
    public void eat (Food f) {
        if (f.getClass().getSimpleName().equals("Vegetable")) {
            System.out.println(this.getClass().getSimpleName() + "s are not eating that type of food!");
            f.setQuantity(0);
        }
        this.setFoodEaten(f.getQuantity());
    }
}
