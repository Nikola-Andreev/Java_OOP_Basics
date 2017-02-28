package C_Inheritance.Exercises.F_Animals06;

public class Kitten extends Cat{
    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    @Override
    public String produceSound() {
        return "Miau";
    }
}
