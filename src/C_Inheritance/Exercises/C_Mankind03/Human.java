package C_Inheritance.Exercises.C_Mankind03;

public class Human {
    private String _firstName;
    private String _lastName;

    Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    private String getFirstName() {
        return this._firstName;
    }

    private void setFirstName(String firstName) {
        if (Character.isLowerCase(firstName.charAt(0)) ){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        } else if (firstName.trim().length() < 4) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this._firstName = firstName;
    }

    private String getLastName() {
        return this._lastName;
    }

    private void setLastName(String lastName) {
        if (Character.isLowerCase(lastName.charAt(0)) ){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        } else if (lastName.trim().length() < 3) {
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this._lastName = lastName;
    }

    @Override
    public String toString() {
        return "First Name: " + this.getFirstName()
                + System.lineSeparator()
                + "Last Name: " + this.getLastName()
                + System.lineSeparator();
    }
}