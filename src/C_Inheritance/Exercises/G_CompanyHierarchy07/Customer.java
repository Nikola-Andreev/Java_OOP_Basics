package C_Inheritance.Exercises.G_CompanyHierarchy07;

class Customer extends Person{
    private Double _netPurchaseAmount;
    Customer(int id, String firstName, String lasttName, double ammount) {
        super(id, firstName, lasttName);
        this.setNetPurchaseAmount(ammount);
    }

    public Double getTotalAmountSpent() {
        return this._netPurchaseAmount;
    }

    private void setNetPurchaseAmount(Double netPurchaseAmount) {
        this._netPurchaseAmount = netPurchaseAmount;
    }
}
