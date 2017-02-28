package D_Polymorphism.Exercises.C_WildFarm03.Animals;

public class Zebra extends Mammal{
    public Zebra(String name, Double weight, String livingRegion) {
        super(name, weight, livingRegion);
    }

    public void makeSound () {
        System.out.println("Zs");
    }
}
