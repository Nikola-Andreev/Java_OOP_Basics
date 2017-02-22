package A_DefiningClasses.Exercises.B_CreatingConstructors02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IOException, IllegalAccessException, InvocationTargetException, InstantiationException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        Class personClass = Person.class;
        Constructor emptyConstructor = personClass.getDeclaredConstructor();
        Constructor ageConstructor = personClass.getDeclaredConstructor(int.class);
        Constructor nameAgeConstructor = personClass.getDeclaredConstructor(String.class, int.class);

        String name = br.readLine();
        int age = Integer.parseInt(br.readLine());

        Person basePerson = (Person) emptyConstructor.newInstance();
        Person personWithAge = (Person) ageConstructor.newInstance(age);
        Person personFull = (Person) nameAgeConstructor.newInstance(name, age);

        System.out.printf("%s %s%n", basePerson._name, basePerson._age);
        System.out.printf("%s %s%n", personWithAge._name, personWithAge._age);
        System.out.printf("%s %s%n", personFull._name, personFull._age);
    }
}
