package A_DefiningClasses.Exercises.F_RawData06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Car> cars = new LinkedList<>();
        int number = Integer.parseInt(scan.readLine());

        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split("\\s+");
            String model = input[0];
            Integer engineSpeed = Integer.valueOf(input[1]);
            Integer enginePower = Integer.valueOf(input[2]);
            Integer cargoWeight = Integer.valueOf(input[3]);
            String cargoType = input[4];
            Double tyre1Pressure = Double.valueOf(input[5]);
            Integer tyre1Age = Integer.valueOf(input[6]);
            Double tyre2Pressure = Double.valueOf(input[7]);
            Integer tyre2Age = Integer.valueOf(input[8]);
            Double tyre3Pressure = Double.valueOf(input[9]);
            Integer tyre3Age = Integer.valueOf(input[10]);
            Double tyre4Pressure = Double.valueOf(input[11]);
            Integer tyre4Age = Integer.valueOf(input[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tyre tyre1 = new Tyre(tyre1Pressure, tyre1Age);
            Tyre tyre2 = new Tyre(tyre2Pressure, tyre2Age);
            Tyre tyre3 = new Tyre(tyre3Pressure, tyre3Age);
            Tyre tyre4 = new Tyre(tyre4Pressure, tyre4Age);
            Tyre[] tyres = {tyre1, tyre2, tyre3, tyre4};
            Car car = new Car(model, engine, cargo, tyres);
            cars.add(car);
        }

        String type = scan.readLine();

        if ("fragile".equals(type)) {
            cars.stream().filter(c -> c.getCargo().getType().equals("fragile"))
                    .filter(Car::checkTyresPressure).forEach( c -> System.out.println(c.getModel()));
        } else {
            cars.stream().filter(c -> c.getCargo().getType().equals("flamable"))
                    .filter(c -> c.getEngine().getPower() > 250).forEach( c -> System.out.println(c.getModel()));
        }
    }
}
