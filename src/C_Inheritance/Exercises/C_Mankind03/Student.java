package C_Inheritance.Exercises.C_Mankind03;

public class Student extends Human{
    private String _facultyNumber;

    Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private String getFacultyNumber() {
        return this._facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this._facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "Faculty number: " + this.getFacultyNumber();
    }
}
