package C_Inheritance.Exercises.G_CompanyHierarchy07;

import java.util.ArrayList;

class Developer extends Employee{
    private ArrayList<Project> projects;

    Developer(int id, String firstName, String lasttName) {
        super(id, firstName, lasttName);
        this.setProjects();
    }

    private void setProjects() {
        this.projects = new ArrayList<>();
    }

    ArrayList<Project> getProjects() {
       return this.projects;
    }
}
