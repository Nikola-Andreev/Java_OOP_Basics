package B_Encapsulation.Exersises.A_ClassBox01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        double length = Double.parseDouble(scan.readLine());
        double width = Double.parseDouble(scan.readLine());
        double height = Double.parseDouble(scan.readLine());

        Box box = new Box(length, width, height);
        System.out.printf("Surface Area - %.2f%n",box.getSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f%n",box.getLateralSurfaceArea());
        System.out.printf("Volume - %.2f%n",box.getVolume());
    }
}