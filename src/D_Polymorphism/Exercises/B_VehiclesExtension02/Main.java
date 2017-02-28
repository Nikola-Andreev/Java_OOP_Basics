package D_Polymorphism.Exercises.B_VehiclesExtension02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] carTokens = scan.readLine().split("\\s+");
        String[] truckTokens = scan.readLine().split("\\s+");
        String[] busTokens = scan.readLine().split("\\s+");
        int numberOfCommands = Integer.parseInt(scan.readLine());

        Vehicle audiA4 = new Car(Double.valueOf(carTokens[1]), Double.valueOf(carTokens[2]), Double.valueOf(carTokens[3]));
        Vehicle man = new Truck(Double.valueOf(truckTokens[1]), Double.valueOf(truckTokens[2]), Double.valueOf(truckTokens[3]));
        Bus icarus = new Bus(Double.valueOf(busTokens[1]), Double.valueOf(busTokens[2]), Double.valueOf(busTokens[3]));

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandTokens = scan.readLine().split("\\s+");
            try {
                if (commandTokens[0].toLowerCase().contains("drive")) {
                    if (commandTokens[1].toLowerCase().equals("car")) {
                        audiA4.drive(Double.valueOf(commandTokens[2]));
                    } else if (commandTokens[1].toLowerCase().equals("truck")) {
                        man.drive(Double.valueOf(commandTokens[2]));
                    } else {
                        if (commandTokens[0].equals("driveEmpty")){
                            icarus.driveEmpty(Double.valueOf(commandTokens[2]));
                        } else {
                            icarus.drive(Double.valueOf(commandTokens[2]));
                        }
                    }
                    DecimalFormat df = new DecimalFormat("#.#########################");
                    System.out.println(commandTokens[1] + " travelled " + df.format(Double.valueOf(commandTokens[2])) + " km");
                } else {
                    if (commandTokens[1].toLowerCase().equals("car")) {
                        audiA4.refuel(Double.valueOf(commandTokens[2]));
                    } else if (commandTokens[1].toLowerCase().equals("truck")) {
                        man.refuel(Double.valueOf(commandTokens[2]));
                    } else {
                        icarus.refuel(Double.valueOf(commandTokens[2]));
                    }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(audiA4);
        System.out.println(man);
        System.out.println(icarus);
    }
}