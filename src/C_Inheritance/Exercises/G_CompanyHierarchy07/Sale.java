package C_Inheritance.Exercises.G_CompanyHierarchy07;

import java.util.Date;

public class Sale {
    private String _productName;
    private Date _date;
    private Double _price;

    Sale(String productName, Date date, Double price) {
        this.setProductName(productName);
        this.setDate(date);
        this.setPrice(price);
    }

    public String getProductName() {
        return this._productName;
    }

    private void setProductName(String productName) {
        //if (productName.length() < 3) {
        //    throw new IllegalArgumentException("Invalid input!");
        //}
        this._productName = productName;
    }

    public Date getDate() {
        return this._date;
    }

    private void setDate(Date date) {
        this._date = date;
    }

    public Double getPrice() {
        return this._price;
    }

    private void setPrice(Double price) {
        this._price = price;
    }
}
