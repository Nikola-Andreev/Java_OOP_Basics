package A_DefiningClasses.Exercises.G_CarSaleman07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int numberOfEngines = Integer.parseInt(scan.readLine());
        LinkedHashMap<String, Engine> engines = new LinkedHashMap<>();

        for (int i = 0; i < numberOfEngines; i++) {
            String[] engineParameters = scan.readLine().split("\\s+");
            Engine en = createEngine(engineParameters);
            engines.put(engineParameters[0] , en);
        }

        int numberOfCars = Integer.parseInt(scan.readLine());

        for (int i = 0; i < numberOfCars; i++) {
            String[] carsParameters = scan.readLine().split("\\s+");
            Car car = createCar(carsParameters, engines);
            System.out.println(car);
        }
    }

    private static Car createCar(String[] carsParameters, LinkedHashMap<String, Engine> engines) {
        String model = carsParameters[0];
        Engine engine = engines.get(carsParameters[1]);

        if (carsParameters.length == 2){
            return new Car(model, engine);
        }

        if (carsParameters.length == 4){
            String weight = carsParameters[2];
            String color = carsParameters[3];
            return new Car(model, engine, weight, color);
        }

        try {
            Integer weight = Integer.valueOf(carsParameters[2]);
            return new Car(model, engine, weight);
        } catch (NumberFormatException e){
            String color = carsParameters[2];
            return new Car(model, engine, color);
        }

    }

    private static Engine createEngine(String[] engineParameters) {

        String model = engineParameters[0];
        Integer power = Integer.valueOf(engineParameters[1]);
        if (engineParameters.length == 2){
            return new Engine(model, power);
        }

        if (engineParameters.length == 4){
            String displacement = engineParameters[2];
            String efficiency = engineParameters[3];
            return new Engine(model, power, displacement, efficiency);
        }

        try {
            Integer displacement = Integer.valueOf(engineParameters[2]);
            return new Engine(model, power, displacement);
        } catch (NumberFormatException e){
            String efficiency = engineParameters[2];
            return new Engine(model, power, efficiency);
        }
    }
}