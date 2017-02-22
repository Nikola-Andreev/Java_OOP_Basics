package A_DefiningClasses.Exercises.D_CompanyRoaster04;

import java.text.DecimalFormat;

public class Employee {
    private String _name;
    private double _salary;
    private String _position;
    private String _department;
    private String _email;
    private int _age;

    Employee (String name, double salary, String position, String department) {
        this (name, salary, position, department, "n/a", -1);
    }

    Employee (String name, double salary, String position, String department, int age) {
        this (name, salary, position, department, "n/a", age);
    }

    Employee (String name, double salary, String position, String department, String email) {
        this (name, salary, position, department, email, -1);
    }

    Employee(String name, double salary, String position, String department, String email, int age) {
        this._name = name;
        this._salary = salary;
        this._position = position;
        this._department = department;
        this._email = email;
        this._age = age;
    }

    public String getDepartment() {
        return this._department;
    }

    public String getPosition() {
        return this._position;
    }

    public double getSalary() {
        return this._salary;
    }

    @Override
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        return this._name + " " + df.format(this._salary) + " " + this._email + " " + this._age;
    }
}
