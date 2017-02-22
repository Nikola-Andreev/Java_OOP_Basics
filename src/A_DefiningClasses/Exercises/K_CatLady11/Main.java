package A_DefiningClasses.Exercises.K_CatLady11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> cats = new HashSet<>();
        while (true){
            String input = scan.readLine();
            if ("End".equals(input)) break;
            cats.add(input);
        }
        String targetName = scan.readLine();
        for (String cat : cats) {
            if (cat.contains(targetName)){
                System.out.println(cat);
                break;
            }
        }
    }
}
