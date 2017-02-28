package C_Inheritance.Exercises.F_Animals06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String type = reader.readLine();
            if (type.equals("Beast!")) {
                break;
            }
            String[] params = reader.readLine().split("\\s+");
            Animal animal = null;
            try {
                switch (type) {
                    case "Frog":
                        animal = tryCreateFrog(params);
                        break;
                    case "Dog":
                        animal = tryCreateDog(params);
                        break;
                    case "Cat":
                        animal = tryCreateCat(params);
                        break;
                    case "Kitten":
                        animal = tryCreateKitten(params);
                        break;
                    case "Tomcat":
                        animal = tryCreateTomcat(params);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid input!");
                }

                if (animal != null) {
                    System.out.println(animal);
                    System.out.println(animal.produceSound());
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static Tomcat tryCreateTomcat(String[] params) {
        String name = params[0];
        int age = Integer.valueOf(params[1]);
        return new Tomcat(name, age);
    }

    private static Kitten tryCreateKitten(String[] params) {
        String name = params[0];
        int age = Integer.valueOf(params[1]);
        return new Kitten(name, age);
    }

    private static Cat tryCreateCat(String[] params) {
        String name = params[0];
        int age = Integer.valueOf(params[1]);
        String gender = params[2];
        return new Cat(name, age, gender);
    }

    private static Dog tryCreateDog(String[] params) {
        String name = params[0];
        int age = Integer.valueOf(params[1]);
        String gender = params[2];
        return new Dog(name, age, gender);
    }

    private static Frog tryCreateFrog(String[] params) {
        String name = params[0];
        int age = Integer.valueOf(params[1]);
        String gender = params[2];
        return new Frog(name, age, gender);
    }
}