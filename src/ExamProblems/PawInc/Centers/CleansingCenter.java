package ExamProblems.PawInc.Centers;

import ExamProblems.PawInc.Animals.Animal;

public class CleansingCenter extends Center{
    public CleansingCenter(String name) {
        super(name);
    }

    public void cleanAnimalsAndSendToHome() {
        for (int i = 0; i < this.getUncleanedAnimals().size(); i++) {
            Animal currentAnimal = this.getUncleanedAnimals().get(i);
            currentAnimal.setCleansingStatus(true);
            currentAnimal.getAnimalCenter().addCleanedAnimal(currentAnimal);
        }
        this.getUncleanedAnimals().clear();
    }
}
