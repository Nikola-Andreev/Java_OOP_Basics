package A_DefiningClasses.Exercises.I_Google09;

import java.util.LinkedList;

public class Person {
    private String _name;
    private Car _car;
    private Company _company;
    private LinkedList<Parent> _parents;
    private LinkedList<Children> _childrens;
    private LinkedList<Pokemon> _pokemons;

    Person (String name){
        this._name = name;
        this._car = new Car("","");
        this._company = new Company("","");
        this._parents = new LinkedList<>();
        this._childrens = new LinkedList<>();
        this._pokemons = new LinkedList<>();
    }

    public void updateProperty (Object property) {
        String objectType = (property.getClass() + "").substring(45);
        switch (objectType) {
            case "Company":
                this._company = (Company) property;
                break;
            case "Car":
                this._car = (Car) property;
                break;
            default:
                break;
        }
    }

    public void addProperty (Object property) {
        String objectType = (property.getClass() + "").substring(45);
        switch (objectType) {
            case "Pokemon":
                this._pokemons.add((Pokemon) property);
                break;
            case "Parent":
                this._parents.add((Parent) property);
                break;
            case "Children":
                this._childrens.add((Children) property);
                break;
            default:
                break;
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        result.append(this._name).append("\n");
        result.append(this._company.toString()).append("\n");
        result.append(this._car.toString()).append("\n");
        result.append("Pokemon:").append("\n");
        for (Pokemon _pokemon : _pokemons) {
            result.append(_pokemon.toString());
        }
        result.append("Parents:").append("\n");
        for (Parent _parent : _parents) {
            result.append(_parent.toString());
        }
        result.append("Children:").append("\n");
        for (Children _child : _childrens) {
            result.append(_child.toString());
        }
        return result.toString();
    }
}
