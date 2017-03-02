package D_Polymorphism.Lab.Shapes01;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.setRadius(radius);
    }

    private final double getRadius() {
        return this.radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        return 2 * Math.PI * this.getRadius();
    }

    @Override
    public Double calculateArea() {
        return Math.PI * this.getRadius() * this.getRadius();
    }
}
