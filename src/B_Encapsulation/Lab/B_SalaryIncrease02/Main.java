package B_Encapsulation.Lab.B_SalaryIncrease02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] personParameters = scan.readLine().split(" ");
            persons.add(new Person(personParameters[0], personParameters[1],
                    Integer.valueOf(personParameters[2]), Double.valueOf(personParameters[3])));
        }

        int bonus = Integer.parseInt(scan.readLine());
        for (Person person : persons) {
            person.increaseSalary(bonus);
            System.out.println(person);
        }
    }
}
