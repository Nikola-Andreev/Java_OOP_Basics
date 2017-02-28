package C_Inheritance.Exercises.A_Person01;

public class Person {
    private String _name;
    private int _age;

    public Person(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this._name;
    }

    protected void setName(String name) {
        if (name.trim().length() < 3) {
            throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
        }
        this._name = name;
    }

    public int getAge() {
        return this._age;
    }

    protected void setAge(int age) {
        if (age < 1) {
            throw new IllegalArgumentException("Age must be positive!");
        }
        this._age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.getName() + ", Age: " + this.getAge();
    }
}