package A_DefiningClasses.Exercises.E_SpeedRacing05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {

    private static LinkedHashMap<String, Car> cars = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());

        for (int i = 0; i < number; i++) {
            String[] carParameters = scan.readLine().split("\\s+");
            String model = carParameters[0];
            Double fuelAmount = Double.valueOf(carParameters[1]);
            Double fuelCost = Double.valueOf(carParameters[2]);
            Car car = new Car(model, fuelAmount, fuelCost);
            cars.put(model, car);
        }

        while (true) {
            String[] command = scan.readLine().split("\\s+");
            if ("End".equals(command[0])) break;
            String carType = command[1];
            Double targetKilometers = Double.valueOf(command[2]);

            if (cars.containsKey(carType)) {
                if (!cars.get(carType).drive(targetKilometers)){
                    System.out.println("Insufficient fuel for the drive");
                }
            }
        }

        for (Car car : cars.values()) {
            System.out.println(car);
        }
    }
}
