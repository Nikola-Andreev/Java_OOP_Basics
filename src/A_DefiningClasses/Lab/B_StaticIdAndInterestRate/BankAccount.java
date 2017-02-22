package A_DefiningClasses.Lab.B_StaticIdAndInterestRate;

class BankAccount {

    private Integer _id;
    private Double _balance = 0.0;
    private static final Double _interestRate = 0.02;
    private static Double _rate = 0.02;

    public Double getBalance() {
        return this._balance;
    }

    public void setId(int id) {
        this._id = id;
    }

    public static void setInterestRate(Double interest) {
        _rate = interest;
    }

    public Double getInterest(int years) {
        return this._balance * _rate * years;
    }

    public void deposit(Double amount) {
        this._balance += amount;
    }

    @Override
    public String toString() {
        return "ID" + this._id;
    }
}
