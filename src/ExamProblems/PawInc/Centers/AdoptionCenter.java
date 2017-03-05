package ExamProblems.PawInc.Centers;

import ExamProblems.PawInc.Animals.Animal;

import java.util.ArrayList;

public class AdoptionCenter extends Center{
    private ArrayList<Animal> cleanedAnimals;

    public AdoptionCenter(String name) {
        super(name);
        this.setCleanedAnimals();
    }

    public final ArrayList<Animal> getCleanedAnimals() {
        return this.cleanedAnimals;
    }

    private void setCleanedAnimals() {
        this.cleanedAnimals = new ArrayList<>();
    }

    public final void addCleanedAnimal(Animal a){
        this.getCleanedAnimals().add(a);
    }

    public void sendAnimalsForCleaning(CleansingCenter cc) {
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = getUncleanedAnimals().get(i);
            cc.addNewAnimal(currentAnimal);
        }
        this.getUncleanedAnimals().clear();
    }

    public void sendAnimalsForCastration(CastrationCenter cc) {
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = getUncleanedAnimals().get(i);
            cc.addNewAnimal(currentAnimal);
        }
        for (int i = 0; i < this.getCleanedAnimals().size(); i++) {
            Animal currentAnimal = getUncleanedAnimals().get(i);
            cc.addNewAnimal(currentAnimal);
        }
        this.getCleanedAnimals().clear();
        this.getUncleanedAnimals().clear();
    }

    public final void adoptAnimals() {
        this.getCleanedAnimals().clear();
    }
}