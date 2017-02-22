package A_DefiningClasses.Exercises.I_Google09;

import java.text.DecimalFormat;

public class Company {
    private String _name;
    private String _department;

    Company (String name , String department) {
        this._name = name;
        this._department = department;
    }

    @Override
    public String toString () {
        StringBuilder result = new StringBuilder();
        DecimalFormat df = new DecimalFormat("0.00");
        if (this._name.equals("")){
            return "Company:";
        }
        result.append("Company:").append("\n").append(this._name).append(" ").append(df.format(Double.valueOf(this._department)));
        return result.toString();
    }
}
