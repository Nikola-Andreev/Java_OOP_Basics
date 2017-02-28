package C_Inheritance.Exercises.C_Mankind03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] studentTokens = scan.readLine().split("\\s+");
        String[] workerTokens = scan.readLine().split("\\s+");

        try {
            Student student = new Student(studentTokens[0], studentTokens [1], studentTokens[2]);
            System.out.println(student);
            System.out.println();
            Worker worker = new Worker(workerTokens[0], workerTokens[1], Double.valueOf(workerTokens[2]), Double.valueOf(workerTokens[3]));
            System.out.println(worker);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
