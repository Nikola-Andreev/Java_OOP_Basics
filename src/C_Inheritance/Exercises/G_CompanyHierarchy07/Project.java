package C_Inheritance.Exercises.G_CompanyHierarchy07;

import java.util.Date;

public class Project {
    private String _name;
    private Date _startDate;
    private String _details;
    private String state;

    Project(String name, Date startDate, String details) {
        this.setName(name);
        this.setStartDate(startDate);
        this.setDetails(details);
        this.setState();
    }

    private void setState() {
        this.state = "OPEN";
    }

    public String getState() {
       return this.state;
    }

    public void closeProject() {
        this.state = "CLOSED";
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        //if (name.length() < 3) {
        //    throw new IllegalArgumentException("Invalid input!");
        //}
        this._name = name;
    }

    public Date getStartDate() {
        return this._startDate;
    }

    private void setStartDate(Date startDate) {
        this._startDate = startDate;
    }

    public String getDetails() {
        return this._details;
    }

    private void setDetails(String details) {
        //if (details.length() < 3){
        //    throw new IllegalArgumentException("Invalid input!");
        //}
        this._details = details;
    }
}