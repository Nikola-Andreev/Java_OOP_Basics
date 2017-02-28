package D_Polymorphism.Exercises.A_Vehicles01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] carTokens = scan.readLine().split("\\s+");
        String[] truckTokens = scan.readLine().split("\\s+");
        int numberOfCommands = Integer.parseInt(scan.readLine());
        Vehicle audiA4 = new Car(Double.valueOf(carTokens[1]), Double.valueOf(carTokens[2]));
        Vehicle man = new Truck(Double.valueOf(truckTokens[1]), Double.valueOf(truckTokens[2]));

        for (int i = 0; i < numberOfCommands; i++) {
            String[] commandTokens = scan.readLine().split("\\s+");
            try {
                if (commandTokens[0].toLowerCase().equals("drive")) {
                    if (commandTokens[1].toLowerCase().equals("car")) {
                        audiA4.drive(Double.valueOf(commandTokens[2]));
                    } else {
                        man.drive(Double.valueOf(commandTokens[2]));
                    }
                    DecimalFormat df = new DecimalFormat("#.#########################");
                    System.out.println(commandTokens[1] + " travelled " + df.format(Double.valueOf(commandTokens[2])) + " km");
                } else {
                    if (commandTokens[1].toLowerCase().equals("car")) {
                        audiA4.refuel(Double.valueOf(commandTokens[2]));
                    } else {
                        man.refuel(Double.valueOf(commandTokens[2]));
                    }
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println(audiA4);
        System.out.println(man);
    }
}