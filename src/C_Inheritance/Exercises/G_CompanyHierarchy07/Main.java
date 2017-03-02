package C_Inheritance.Exercises.G_CompanyHierarchy07;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] inputTokens = scanner.nextLine().split("\\s+");
        Department department = Department.valueOf(inputTokens[0]);

        SalesEmployee salesEmployee = new SalesEmployee(Integer.valueOf(inputTokens[1]), inputTokens[2], inputTokens[3], department);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Integer.valueOf(inputTokens[4]),
                Integer.valueOf(inputTokens[5]),
                Integer.valueOf(inputTokens[6]));

        Sale sale = new Sale(inputTokens[7], calendar.getTime(), Double.valueOf(inputTokens[8]));
        salesEmployee.getSales().add(sale);
        calendar.set(Integer.valueOf(inputTokens[9]),
                Integer.valueOf(inputTokens[10]),
                Integer.valueOf(inputTokens[11]));

        Project project = new Project(inputTokens[12], calendar.getTime(), inputTokens[13]);

        Developer developer = new Developer(Integer.valueOf(inputTokens[14]), inputTokens[15], inputTokens[16]);
        developer.getProjects().add(project);

        System.out.println(project.getState());
        project.closeProject();
        System.out.println(project.getState());

        Customer customer = new Customer(Integer.valueOf(inputTokens[17]), inputTokens[18], inputTokens[19], Double.valueOf(inputTokens[20]));

        System.out.println(customer.getTotalAmountSpent());
        salesEmployee.getSales().forEach(System.out::println);
        System.out.println(salesEmployee.getDepartment());
        System.out.println(salesEmployee.toString());
        System.out.println(project.toString());
        System.out.println(customer);
    }
}