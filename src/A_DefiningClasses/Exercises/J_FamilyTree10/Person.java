package A_DefiningClasses.Exercises.J_FamilyTree10;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    String birthday;
    List<Person> parents;
    List<Person> children;

    Person(String name, String birthday) {
        this.setName(name);
        this.setBirthday(birthday);
        this.setParents(new ArrayList<>());
        this.setChildren(new ArrayList<>());
    }

    public void changeName(String name) {
        this.setName(name);
    }

    public void changeBirthday(String birthday) {
        this.setBirthday(birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<Person> getParents() {
        return parents;
    }

    public void setParents(List<Person> parents) {
        this.parents = parents;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public void addChild(Person child) {
        this.getChildren().add(child);
    }

    public void addParent(Person parent) {
        this.getParents().add(parent);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.name).append(" ").append(this.birthday).append(System.lineSeparator());
        result.append("Parents:").append(System.lineSeparator());
        if (this.parents.size() > 0){
            for (Person parent : this.parents) {
                result.append(parent.getName()).append(" ").append(parent.getBirthday()).append(System.lineSeparator());
            }
        }
        result.append("Children:").append(System.lineSeparator());
        if (this.children.size() > 0){
            for (Person children : this.children) {
                result.append(children.getName()).append(" ").append(children.getBirthday()).append(System.lineSeparator());
            }
        }
        return result.toString();
    }
}