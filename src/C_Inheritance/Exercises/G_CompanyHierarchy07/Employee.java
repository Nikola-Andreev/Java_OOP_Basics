package C_Inheritance.Exercises.G_CompanyHierarchy07;

public class Employee extends Person{
    private Double _salary;
    private Department _department;

    Employee(int id, String firstName, String lasttName, Double salary, Department department) {
        super(id, firstName, lasttName);
        this.setSalary(salary);
        this.setDepartment(department);
    }

    Employee(int id, String firstName, String lasttName) {
        super(id, firstName, lasttName);
        this.setSalary(0.0);
    }

    Employee(int id, String firstName, String lasttName,  Department department) {
        super(id, firstName, lasttName);
        this.setSalary(0.0);
        this.setDepartment(department);
    }

    public Double getSalary() {
        return this._salary;
    }

    private void setSalary(Double salary) {
        //if (salary > 0) {
            this._salary = salary;
        //} else {
        //    throw new IllegalArgumentException("Invalid input!");
        //}
    }

    public Department getDepartment() {
        return this._department;
    }

    private void setDepartment(Department department) {
        this._department = department;
    }
}
