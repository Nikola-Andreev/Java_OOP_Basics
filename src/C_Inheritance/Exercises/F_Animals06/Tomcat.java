package C_Inheritance.Exercises.F_Animals06;

public class Tomcat extends Cat{
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public String produceSound() {
        return "Give me one million b***h";
    }
}
