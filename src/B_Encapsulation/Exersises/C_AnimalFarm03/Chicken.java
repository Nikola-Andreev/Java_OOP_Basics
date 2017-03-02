package B_Encapsulation.Exersises.C_AnimalFarm03;

public class Chicken {
    private final int MIN_AGE = 0;
    private int MAX_AGE = 15;

    private String name;
    private int age;

    Chicken(String name, int age) {
        if (name.isEmpty() || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        if (age < 0 || age > 15) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }

        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    double getProductPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        if (this.age >=0 && this.age < 6) {
            return 2;
        } else if (this.age >= 6 && this.age < 12){
            return 1;
        } else {
            return 0.75;
        }
    }
}