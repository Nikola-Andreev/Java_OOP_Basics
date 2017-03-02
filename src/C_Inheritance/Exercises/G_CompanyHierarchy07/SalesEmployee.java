package C_Inheritance.Exercises.G_CompanyHierarchy07;

import java.util.ArrayList;

class SalesEmployee extends Employee{
    private ArrayList<Sale> sales = new ArrayList<>();

    SalesEmployee(int id, String firstName, String lasttName, Double salary, Department department) {
        super(id, firstName, lasttName, salary, department);
    }

    public SalesEmployee(int id, String firstName, String lasttName, Department department) {
        super(id, firstName, lasttName, department);
    }

    public ArrayList<Sale> getSales() {
        return this.sales;
    }
}
