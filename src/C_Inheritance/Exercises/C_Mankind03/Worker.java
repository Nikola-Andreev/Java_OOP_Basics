package C_Inheritance.Exercises.C_Mankind03;

import java.text.DecimalFormat;

public class Worker extends Human{
   private double _weekSalary;
   private double _workHourPerDay;

    Worker(String firstName, String lastName, double weekSalary, double workHourPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHourPerDay(workHourPerDay);
    }

    private double getWeekSalary() {
        return this._weekSalary;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this._weekSalary = weekSalary;
    }

    private double getWorkHourPerDay() {
        return this._workHourPerDay;
    }

    private void setWorkHourPerDay(double workHourPerDay) {
        if (workHourPerDay < 1 || workHourPerDay > 12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this._workHourPerDay = workHourPerDay;
    }

    private double getSalaryPerHour() {
        return (this.getWeekSalary() / 7) / this.getWorkHourPerDay();
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString()
                + "Week Salary: " + df.format(this.getWeekSalary())
                + System.lineSeparator()
                + "Hours per day: " + df.format(this.getWorkHourPerDay())
                + System.lineSeparator()
                + "Salary per hour: " + df.format(this.getSalaryPerHour());
    }
}