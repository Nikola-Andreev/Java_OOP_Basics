package A_DefiningClasses.Lab.A_BankAccountTestClient;

import java.text.DecimalFormat;

class BankAccount {

    private Integer _id;
    private Double _balance = 0.0;

    public void setId(int id) {
        this._id = id;
    }

    public Double getBalance() {
        return this._balance;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            this._balance += amount;
        }
    }

    public void withdraw(Double amount) {
        if (this._balance - amount >= 0) {
            this._balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "Account ID" + this._id + ", balance " + df.format(this._balance);
    }
}
