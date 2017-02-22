package A_DefiningClasses.Exercises.D_CompanyRoaster04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class Main {

    private static LinkedHashMap<String, LinkedList<Employee>> employees = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());

        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split("\\s+");
            createEmployee(input);
        }

        employees.entrySet().stream().sorted( (em1, em2 )-> {
            final Double[] average1 = {0.0};
            final Double[] average2 = {0.0};
            em1.getValue().forEach(em -> average1[0] += em.getSalary());
            em2.getValue().forEach(em -> average2[0] += em.getSalary());
            return Double.compare(average2[0] / em2.getValue().size(), average1[0] / em1.getValue().size());
        }).limit(1).forEach(dep -> {
            System.out.println("Highest Average Salary: " + dep.getKey());
            dep.getValue().stream().sorted((e1, e2)-> Double.compare(e2.getSalary(), e1.getSalary())).forEach(System.out::println);
        });
    }

    private static void createEmployee(String[] input) {

        String name = input[0];
        Double salary = Double.valueOf(input[1]);
        String position = input[2];
        String department = input[3];

        switch (input.length){
            case 4:
                Employee em = new Employee(name, salary, position, department);
                addEmployeeToMap(em);
                break;
            case 5:
                try {
                    int age = Integer.valueOf(input[4]);
                    em = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e){
                    String email = String.valueOf(input[4]);
                    em = new Employee(name, salary, position, department, email);
                }
                addEmployeeToMap(em);
                break;
            case 6:
                String email = String.valueOf(input[4]);
                int age = Integer.valueOf(input[5]);
                em = new Employee(name, salary, position, department, email, age);
                addEmployeeToMap(em);
                break;
        }
    }

    private static void addEmployeeToMap(Employee em) {

        if (!employees.containsKey(em.getDepartment())){
            employees.put(em.getDepartment(), new LinkedList<>());
        }
        employees.get(em.getDepartment()).add(em);
    }
}
