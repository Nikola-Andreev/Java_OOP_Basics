package A_DefiningClasses.Exercises.A_DefineClassPerson01;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        Class person = Person.class;
        Field[] fields = person.getDeclaredFields();
        System.out.println(fields.length);
    }
}
