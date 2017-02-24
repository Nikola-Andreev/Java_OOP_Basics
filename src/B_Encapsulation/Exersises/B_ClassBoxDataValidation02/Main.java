package B_Encapsulation.Exersises.B_ClassBoxDataValidation02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.parseDouble(scan.readLine());
        double width = Double.parseDouble(scan.readLine());
        double height = Double.parseDouble(scan.readLine());

        try {
            Box box = new Box(length, width, height);
            System.out.printf("Surface Area - %.2f%n",box.getSurfaceArea());
            System.out.printf("Lateral Surface Area - %.2f%n",box.getLateralSurfaceArea());
            System.out.printf("Volume - %.2f%n",box.getVolume());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}