package D_Polymorphism.Lab.Shapes01;

public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super();
        this.setHeight(height);
        this.setWidth(width);
    }

    public double getHeight() {
        return this.height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return this.width;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }

    @Override
    public Double calculateArea() {
        return this.getWidth() * this.getHeight();
    }
}
