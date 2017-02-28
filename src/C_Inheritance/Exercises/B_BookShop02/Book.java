package C_Inheritance.Exercises.B_BookShop02;

import java.math.BigDecimal;

public class Book {
    private String _title;
    private String _author;
    private BigDecimal _price;

    Book(String author, String title, BigDecimal price) {
        this.setAuthor(author);
        this.setTitle(title);
        this.setPrice(price);
    }

    private String getTitle() {
        return this._title;
    }

    private void setTitle(String title) {
        if (title.trim().length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
        this._title = title;
    }

    private String getAuthor() {
        return this._author;
    }

    private void setAuthor(String author) {
        String[] authorTokens = author.trim().split("\\s+");
        if (authorTokens.length > 1) {
            if (Character.isDigit(authorTokens[1].charAt(0))) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }
        this._author = author;
    }

    public BigDecimal getPrice() {
        return this._price;
    }

    private void setPrice(BigDecimal price) {
        if (price.compareTo(new BigDecimal(1)) == -1) {
            throw new IllegalArgumentException("Price not valid!");
        }
        this._price = price;
    }

    @Override
    public String toString() {
        return "Type: " + this.getClass().getSimpleName() +
                System.lineSeparator() +
                "Title: " + this.getTitle() +
                System.lineSeparator() +
                "Author: " + this.getAuthor() +
                System.lineSeparator() +
                "Price: " + this.getPrice().setScale(1, BigDecimal.ROUND_HALF_UP) +
                System.lineSeparator();

    }
}