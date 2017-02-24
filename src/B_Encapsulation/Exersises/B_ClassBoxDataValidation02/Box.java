package B_Encapsulation.Exersises.B_ClassBoxDataValidation02;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        if (length <= 0){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        } else if (width <= 0){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        } else if (height <= 0){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        } else {
            this.length = length;
            this.width = width;
            this.height = height;
        }
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
