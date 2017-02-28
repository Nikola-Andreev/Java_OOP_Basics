package D_Polymorphism.Exercises.C_WildFarm03.Animals;

import java.text.DecimalFormat;

abstract class Mammal extends Animal {
    private String _livingRegion;

    Mammal(String name, Double weight, String livingRegion) {
        super(name, weight);
        this.setLivingRegion(livingRegion);
    }

    String getLivingRegion() {
        return this._livingRegion;
    }

    private void setLivingRegion(String livingRegion) {
        this._livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.####################");
        return this.getClass().getSimpleName() + "[" + this.getName() + ", " +
                df.format(this.getWeight()) + ", " + this.getLivingRegion() +", " + this.getFoodEaten() + "]";
    }
}
