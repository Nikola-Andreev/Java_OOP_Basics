package A_DefiningClasses.Exercises.B_CreatingConstructors02;

public class Person {
    int _age;
    String _name;

    Person (){
        this._age = 1;
        this._name = "No name";
    }

    Person (int age) {
        this._name = "No name";
        this._age = age;
    }

    Person (String name, int age) {
        this._age = age;
        this._name = name;
    }
}
