package B_Encapsulation.Exersises.A_ClassBox01;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurfaceArea() {
        return 2*length*width + 2*length*height + 2*width*height;
    }

    public double getLateralSurfaceArea() {
        return 2*length*height + 2*width*height;
    }

    public double getVolume() {
        return length * height * width;
    }
}
