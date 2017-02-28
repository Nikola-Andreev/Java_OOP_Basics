package C_Inheritance.Exercises.B_BookShop02;

import java.math.BigDecimal;

class GoldenEditionBook extends Book {

    GoldenEditionBook(String title, String author, BigDecimal price) {
        super(title, author, price);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(super.getPrice().multiply(new BigDecimal(0.3)));
    }
}
