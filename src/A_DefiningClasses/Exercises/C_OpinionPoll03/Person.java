package A_DefiningClasses.Exercises.C_OpinionPoll03;

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

    @Override
    public String toString() {
        return this._name + " - " + this._age;
    }

    public String compareTo(Person p) {
        if (p._name.compareTo(this._name) == -1){
            return this._name;
        } else {
            return p._name;
        }
    }
}
