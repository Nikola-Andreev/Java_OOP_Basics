package C_Inheritance.Exercises.G_CompanyHierarchy07;

import java.util.Arrays;

class Department {

    private static final String[] DEPARTMENTS = {"Production", "Accounting", "Sales", "Marketing"};
    private String _name;

    private Department(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        if (Arrays.asList(DEPARTMENTS).contains(name)) {
            this._name = name;
        }
    }

    public static Department valueOf (String st) {
        return new Department(st);
    }
}
