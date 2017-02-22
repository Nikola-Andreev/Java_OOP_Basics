package A_DefiningClasses.Exercises.C_OpinionPoll03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split("\\s+");
            String name = input[0];
            int age = Integer.valueOf(input[1]);
            Person person = new Person(name, age);
            persons.add(person);
        }
        persons.stream().filter(p -> p._age > 30).sorted(Comparator.comparing(a -> a._name)).forEach(System.out::println);
    }
}