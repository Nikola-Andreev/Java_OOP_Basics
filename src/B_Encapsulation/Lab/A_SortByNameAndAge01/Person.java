package B_Encapsulation.Lab.A_SortByNameAndAge01;

public class Person {
    private String _firstName;
    private String _lastName;
    private int _age;

    public Person(String firstName, String lastName, int age) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
    }

    public String getFirstName() {
        return this._firstName;
    }

    public String getLastName() {
        return this._lastName;
    }

    public int getAge() {
        return this._age;
    }

    @Override
    public String toString() {
        return this._firstName + " " + this._lastName + " is a " + this._age + " years old.";
    }
}
