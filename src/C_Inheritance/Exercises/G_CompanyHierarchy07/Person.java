package C_Inheritance.Exercises.G_CompanyHierarchy07;

public class Person {
    private int _id;
    private String _firstName;
    private String _lastName;

    public Person(int id, String firstName, String lasttName) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLasttName(lasttName) ;
    }

    public int getId() {
        return this._id;
    }

    private void setId(int id) {
        //if (id > 0) {
            this._id = id;
        //} else {
        //    throw new IllegalArgumentException("Invalid input!");
       // }
    }

    public String getFirstName() {
        return this._firstName;
    }

    private void setFirstName(String firstName) {
        //if (firstName.length() < 3){
        //    throw new IllegalArgumentException("Invalid input!");
        //}
        this._firstName = firstName;
    }

    public String getLasttName() {
        return this._lastName;
    }

    private void setLasttName(String lastName) {
        //if (lastName.length() < 3){
        //    throw new IllegalArgumentException("Invalid input!");
        //}
        this._lastName = lastName;
    }
}
